package com.example.seapp;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class FoodLog extends AppCompatActivity {
    myDBHelper helper;

    ListView userlist;
    ArrayList<String> listItem;
    ArrayAdapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_log);

        userlist = findViewById(R.id.users_list);

        userlist.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                String text = userlist.getItemAtPosition(i).toString();
                Toast.makeText(FoodLog.this,""+text, Toast.LENGTH_SHORT).show();
            }
        });

        Button homeButton2;
        homeButton2 = (Button) findViewById(R.id.homebutton2);
        homeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodLog.this, MainActivity.class));
            }
        });
        {

        }

        helper = new myDBHelper(this);

        listItem = new ArrayList<>();
        getData();
    }

    private void getData() {
        Cursor cursor = helper.viewData();

       if (cursor.getCount() == 0){
           Toast.makeText(FoodLog.this,"No data to show", Toast.LENGTH_SHORT).show();
       } else{
           while (cursor.moveToNext())
               listItem.add(cursor.getString(1));
       }

       adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listItem);
       userlist.setAdapter(adapter);
    }
}
