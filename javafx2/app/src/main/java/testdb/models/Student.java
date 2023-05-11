package testdb.models;

public class Student {

    private String fullname;
    private String nim;
    private String nickname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String username) {
        this.fullname = username;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String id) {
        this.nim = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Student(String username, String id, String nickname) {
        this.fullname = username;
        this.nim = id;
        this.nickname = nickname;
    }
}
