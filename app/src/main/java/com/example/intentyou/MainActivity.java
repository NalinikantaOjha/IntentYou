package com.example.intentyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
protected Button b1;
protected EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        et1=findViewById(R.id.et1);
        find();
    }
    protected void find(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,App2.class);
                intent.putExtra("name",et1.getText().toString());
                startActivity(intent);
               /* Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, " email subject");
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{"dcosxx@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_TEXT, "email content goes here");
                startActivity(emailIntent);*/

            }
        });
    }
}