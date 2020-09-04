package com.example.intentexplicit13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button mBtnString,mBtnArrayList;
    ArrayList<String> mArrayListString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnString = findViewById(R.id.buttonString);
        mBtnArrayList = findViewById(R.id.buttonArrayList);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("chuoi","hello");
                startActivity(intent);
            }
        });

        mBtnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mArrayListString = new ArrayList<>();
                mArrayListString.add("Tuan");
                mArrayListString.add("Hoa");
                mArrayListString.add("Ngoc");
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("array",mArrayListString);
                startActivity(intent);
            }
        });
    }
}