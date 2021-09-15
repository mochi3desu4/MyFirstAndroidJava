package com.example.myfirstandroidjava;

import static java.lang.Integer.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
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
        //  画面に表示するデータを用意する
        String text = "Hello,Android!";
        //  TextViewにデータをセットする
        hello.setText(text);
        //  Text装飾
        hello.setTextColor(Color.parseColor("#FF0000"));
        hello.setTypeface(Typeface.DEFAULT_BOLD);

        /*
        TextViewの仕様
        TextView | Android Developers
        https://developer.android.com/reference/android/widget/TextView/
        ※プログラム実行時はJava設定から上書きされる
         */

    }

}