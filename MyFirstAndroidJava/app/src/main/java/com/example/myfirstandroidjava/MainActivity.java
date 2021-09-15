package com.example.myfirstandroidjava;

import static java.lang.Integer.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  レイアウトからTextViewを取り出す
        TextView hello = findViewById(R.id.texitview_hello);
        //  TextViewにセットされている文字を抜き出す
        String text = hello.getText().toString();
        //  ログに出力する
        Log.d("MainActivity", text);

    }

}