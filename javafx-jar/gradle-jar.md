```
jar {
    duplicatesStrategy = 'exclude'
    manifest {
        attributes 'Main-Class': 'testdb.Launcher'
    }
    from {
        configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }
}
```
