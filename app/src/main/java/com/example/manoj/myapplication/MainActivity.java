 package com.example.manoj.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.manoj.myapplication.R;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     Button btn1;
     Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.startBtn);
        btn2=(Button)findViewById(R.id.stopBtn);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

     @Override
     public void onClick(View view) {

        if (view==btn1)
        {
            startService(new Intent(this,MyService.class));

        }

        else if (view==btn2){
            stopService(new Intent(this,MyService.class));
        }
     }

 }
