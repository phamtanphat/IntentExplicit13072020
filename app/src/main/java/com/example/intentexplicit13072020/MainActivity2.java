package com.example.intentexplicit13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Nhan dang string
//        Intent intent = getIntent();
//        if (intent != null){
//            String chuoi = intent.getStringExtra("chuoi");
//            Log.d("BBB",chuoi);
//        }
        // 2 : Nhan dang array
        Intent intent = getIntent();
        if (intent != null){
            ArrayList<String> arrayString = intent.getStringArrayListExtra("array");
            Log.d("BBB",arrayString.size() + "");
        }
    }
}