package com.example.coursedetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvupper,remain,topcourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvupper=findViewById(R.id.tvupper);
        remain=findViewById(R.id.remain);
        topcourse=findViewById(R.id.topcourse);
        tvupper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CourceName.class).putExtra("type","upper"));
            }
        });

        remain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CourceName.class).putExtra("type","remain"));
            }
        });

        topcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CourceName.class).putExtra("type","top"));
            }
        });

    }
}