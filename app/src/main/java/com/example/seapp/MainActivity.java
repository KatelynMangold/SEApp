package com.example.seapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton addFood;
        addFood = (FloatingActionButton) findViewById(R.id.addFood);
        addFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, search.class));
            }
        });

        Button incr;
        Button decr;
        incr = (Button) findViewById(R.id.button_incr);
        decr = (Button) findViewById(R.id.button_decr);
        incr.setOnClickListener(this);
        decr.setOnClickListener(this);

//        incr.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//
//            }
//        });
        }

    @Override
    public void onClick(View v) {

    }
}