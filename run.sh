#!/bin/sh
./gradlew build
java -cp build/classes/java/main org.mikadomethod.app.Launcher