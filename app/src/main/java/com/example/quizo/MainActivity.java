package com.example.quizo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2= findViewById(R.id.btn2);
        b1= findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj= new Intent(MainActivity.this,Quiz.class);
                startActivity(obj);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj= new Intent(MainActivity.this,Math.class);
                startActivity(obj);
            }
        });


    }
}
