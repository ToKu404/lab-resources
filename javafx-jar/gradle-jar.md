# LINK DOCS
https://openjfx.io/openjfx-docs/#next-steps

## TAMBAHKAN KE BUILD GRADLE
```
mainClassName = '<package_name>.App'
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
java -jar app/build/libs/app.jar
```

## LINK CONVERTER JAR TO EXE
https://genuinecoder.com/online-converter/jar-to-exe/

