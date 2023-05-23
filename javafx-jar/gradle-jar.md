# LINK DOCS
https://openjfx.io/openjfx-docs/#next-steps

## TAMBAHKAN KE BUILD GRADLE
```
jar {
    duplicatesStrategy = 'exclude'
    manifest {
        attributes 'Main-Class': '<package_name>.Launcher'
    }
    from {
        configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }
}
```

## MEMBUAT FILE JAR
```
./gradlew clean
```
```
./gradlew jar
```

## MENJALANKAN FILE JAR
```
java -jar /app/src/main/java/<package_name>/app.jar
```

## LINK CONVERTER JAR TO EXE
https://genuinecoder.com/online-converter/jar-to-exe/

