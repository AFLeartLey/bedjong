# bedjong

Bedjong is a japanese mahjong game based on java and jMonkeyEngine, facing both PC and Android, allowing local and online muiltiplayer (Server not provided).

## Project set up
This is a gradle project using JMonkey Engine and other java libraries

# Modules : 

Game module `:game` : holds `build.gradle` dependencies for the game code & should hold your code.

Desktop module `:desktop` : holds `build.gradle` for desktop dependencies & implements the `:game` module, this module can hold the desktop gui.

Android module `:app` : holds `build.gradle` for the android dependencies & implements the `:game` module, this module can hold android dependent gui.


# Running Game : 

### Desktop : 

```gradle
./gradlew run
```


### Android : 

Install the app on a connected device via adb.

```bash
    $./gradlew :app:installDebug
```
If you are using Android Studio launch and debug options will be available directly within the IDE



# Building Game :

### Desktop :

```bash
    $./gradlew :desktop:copyJars
```

### Android : 
```gradle
    $./gradlew :app:assemble
```

Note that if you are releasing your app on the android play store it must be signed with an appropriate key, see
https://developer.android.com/studio/build/building-cmdline for more details on how to produce such apks

References : 

=> gradlew for android:
https://developer.android.com/studio/build/building-cmdline

=> Gradle DSL : https://docs.gradle.org/current/dsl/index.html

=> Gradle for java : https://docs.gradle.org/current/userguide/multi_project_builds.html

=> Gradle/Groovy Udacity course by google : https://github.com/udacity/ud867/blob/master/1.11-Exercise-ConfigureFileSystemTasks/solution.gradle


=> See JMonkeyEngine Android Examples : https://github.com/Scrappers-glitch/jme3-Simple-Examples

https://github.com/Scrappers-glitch/DBTraining

https://github.com/Scrappers-glitch/Superior-Extended-Engine/tree/master/demoApp


=> See JMonkeyEngine Desktop Example : https://github.com/Scrappers-glitch/basic-gradle-template

=> See JMonkeyEngine RPI armhf Desktop Example : https://github.com/Scrappers-glitch/JmeCarPhysicsTestRPI

