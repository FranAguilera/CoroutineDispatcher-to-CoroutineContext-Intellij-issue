package com.example.dispatchersclasscastdemo;

import androidx.appcompat.app.AppCompatActivity;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;

public class MainActivity extends AppCompatActivity {

    // This is a false positive on Intellij. This assignment compiles just fine.
    // CoroutineDispatcher is always going to be of CoroutineContext type.
    // CoroutineDispatcher -> AbstractCoroutineContextElement -> CoroutineContext.Element -> CoroutineContext
    private CoroutineContext coroutineContext = Dispatchers.getDefault();
}
