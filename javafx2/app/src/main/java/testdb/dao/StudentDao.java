package testdb.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import testdb.models.Student;
import testdb.utils.DatabaseConfig;

public class StudentDao {
    private Connection conn;
    private Statement stmt;

    public StudentDao() {
        conn = DatabaseConfig.getConnection();
        setUpDatabase();
    }

    public List<Student> readDb() throws SQLException {
        try {
            List<Student> listStudent = new ArrayList<>();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                String name = rs.getString("fullname");
                String nim = rs.getString("nim");
                String nickname = rs.getString("nickname");
                listStudent.add(new Student(name, nim, nickname));
            }
            return listStudent;
        } catch (SQLException e) {
            throw new SQLException();
        }
    }

    private void setUpDatabase() {
        try {
            conn = DatabaseConfig.getConnection();
            DatabaseMetaData meta = conn.getMetaData();
            ResultSet rs = meta.getTables(null, null, "students", null);

            if (!rs.next()) {
                System.out.println("Creating table...");
                stmt = conn.createStatement();
                String sql = "CREATE TABLE Students " +
                        "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        " fullname TEXT NOT NULL UNIQUE," +
                        " nim TEXT NOT NULL, " +
                        " nickname TEXT NOT NULL)";
                stmt.executeUpdate(sql);
                System.out.println("Table created successfully");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void synchronizeDb(List<Student> students) {
        try {
            clearDb();
            stmt = conn.createStatement();
            for (Student student : students) {
                String sql = String.format("INSERT INTO students(fullname, nim, nickname) VALUES('%s', '%s', '%s');",
                        student.getFullname(), student.getNim(), student.getNickname());
                stmt.executeUpdate(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearDb() {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE from students");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
