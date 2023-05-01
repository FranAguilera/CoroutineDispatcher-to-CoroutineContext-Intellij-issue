# CoroutineDispatcher-to-CoroutineContext-Intellij-issue
This small sample Android app shows Intellij issue showing cast error in Java files for CoroutineDispatcher to CoroutineContext. This shouldn't be the case giving that a CoroutineContext is always a CoroutineDispatcher.

`CoroutineDispatcher -> AbstractCoroutineContextElement -> CoroutineContext.Element -> CoroutineContext`

See below the error shown on Intellij (in this case `Android Studio Electric Eel | 2022.1.1 Patch 2`)

`app/src/main/java/com/example/dispatchersclasscastdemo/MainActivity.java`

<img width="906" alt="image" src="https://user-images.githubusercontent.com/4230063/235540760-bbe69f5f-ffe4-4783-8d46-872a4daf1223.png">

Compile succeeds without issues

https://user-images.githubusercontent.com/4230063/235541076-263cc5da-9d72-4d01-8561-10ed5a9f53b3.mov

The gradle dependencies are just:

```
dependencies {
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.4'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.8.0'
}
```

`NOTE: One suspect for this, could be the definition of inner interfaces within a parent interface (in this case CoroutineContext.Element is defined within CoroutineContext)`
