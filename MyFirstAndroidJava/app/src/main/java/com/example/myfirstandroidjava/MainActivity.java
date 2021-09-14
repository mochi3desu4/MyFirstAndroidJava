package com.example.myfirstandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ↓プログラム記述箇所↓ MyFirstAndroidJava

        String hello = "Hello, World!";
        int intValue = 123456;
        long longValue = 123456L;
        double doubleValue = 12.3456;
        float floatValue = 12.3456F;
        boolean booleanValue = true;

        Log.d("MainActivity", hello);
        Log.d("MainActivity", "" + intValue);
        Log.d("MainActivity", "" + longValue);
        Log.d("MainActivity", "" + doubleValue);
        Log.d("MainActivity", "" + floatValue);
        Log.d("MainActivity", "" + booleanValue);

        //  ↑プログラム記述ココまで↑

    }
}