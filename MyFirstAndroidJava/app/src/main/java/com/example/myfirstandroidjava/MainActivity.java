package com.example.myfirstandroidjava;

import static java.lang.Integer.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity<helloAndroid> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*  動作確認用に非表示


// リテラルと変数

        String hello = "Hello, World!";
        Log.d("MainActivity", hello);


//  型とリテラル

        int intValue = 123456;
        long longValue = 123456L;
        double doubleValue = 12.3456;
        float floatValue = 12.3456F;
        boolean booleanValue = true;

        Log.d("MainActivity", "" + intValue);
        Log.d("MainActivity", "" + longValue);
        Log.d("MainActivity", "" + doubleValue);
        Log.d("MainActivity", "" + floatValue);
        Log.d("MainActivity", "" + booleanValue);


//  Javaの基本的な計算

        int n1 = 1;
        int n2 = 1;
        int n3 = n1 + n2;
            //  「n3」は「2」

        String s1 = "1";
        String s2 = "1";
        String s3 = s1 + s2;
            //  「s3」は「11」


//  メソッドで処理を部品化
        int result = sum(1, 2) +3;               //  メソッドで呼びだし
        Log.d("MainActivity", "" + result);     //  6
    }

        private int sum(int a, int b) {     //足し算をするメソッドを定義する
            return a + b;                   //足し算の結果を返す
        }
動作確認用に非表示ココまで
*/
        String helloWorld = "Hello, World!";    //  「World」を「Android」に置き換える
        String helloAndroid = helloWorld.replace("World", "Android");
        Log.d("MainActivity", helloAndroid);    //  "Hello, Android!"

    }


//  ↑プログラム記述ココまで↑

}