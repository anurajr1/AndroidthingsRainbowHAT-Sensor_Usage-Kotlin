# AndroidthingsRainbowHAT-Sensor_Usage-Kotlin
Kotlin project to read the sensor value from rainbowHAT

Using Pico pro maker kit - https://developer.android.com/things/hardware/imx7d-kit.html

NXP i.MX7D board - https://developer.android.com/things/hardware/imx7d.html

Kotlin is now an official language on Android. It's expressive, concise, and powerful. Best of all, it's interoperable with our existing Android languages and runtime. The project is written in Kotlin language. Display shows the temperature reading from the rainbowHAT. you can change the code to read the pressure information as well.

Read more about Kotlin in Android- https://developer.android.com/kotlin/index.html


Add the dependencies in gradle
```
dependencies {
    compileOnly 'com.google.android.things:androidthings:+'
    implementation"org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
    compile 'com.google.android.things.contrib:driver-rainbowhat:0.8'
}
```

project gradle
```
    buildscript {
    ext.kotlin_version = '1.1.51'
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.0.1'
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}
```
## Demo

![videotogif_2017 12 27_23 21 32](https://user-images.githubusercontent.com/18279724/34388973-dfba8252-eb5c-11e7-974f-054cc27b38f0.gif)



