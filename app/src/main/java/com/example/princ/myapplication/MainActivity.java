package com.example.princ.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("a", String.valueOf(StringUtil.bf("abcd".toCharArray(), "abc".toCharArray())));
        Log.d("a", String.valueOf(StringUtil.kmp("abcd".toCharArray(), "abc".toCharArray())));
        Log.d("a", String.valueOf(StringUtil.trim("\tadfasd\n\t         ".toCharArray())));
    }
}
