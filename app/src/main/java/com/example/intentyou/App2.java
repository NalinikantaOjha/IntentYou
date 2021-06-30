package com.example.intentyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class App2 extends AppCompatActivity {
protected TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        t1=findViewById(R.id.t1);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        t1.setText(name);
    }
}