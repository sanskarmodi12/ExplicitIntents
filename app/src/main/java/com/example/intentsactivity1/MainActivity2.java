package com.example.intentsactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv2=findViewById(R.id.a2_tv2);
        Intent intent= getIntent();
        tv2.setText("DATA FROM ACTIVITY1 is"+intent.getStringExtra("dataname"));

    }
}