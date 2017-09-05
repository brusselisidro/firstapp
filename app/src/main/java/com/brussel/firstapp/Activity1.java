package com.brussel.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity1 extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }
    public void nextActivity(View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);


    }
}
