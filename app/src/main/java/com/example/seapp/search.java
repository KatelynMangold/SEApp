package com.example.seapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
<<<<<<< HEAD
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
=======
>>>>>>> c4943b84ec3d8922a4086d40ac7803a83e071c98
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
<<<<<<< HEAD
import android.widget.Toolbar;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
=======
>>>>>>> c4943b84ec3d8922a4086d40ac7803a83e071c98

import java.util.ArrayList;

public class search extends AppCompatActivity
{

<<<<<<< HEAD

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        Button homeButton;
        homeButton = (Button) findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        }); {

        }
    }
=======
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

>>>>>>> c4943b84ec3d8922a4086d40ac7803a83e071c98

    }
}