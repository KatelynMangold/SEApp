package com.example.seapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.AdapterView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    TextView textView1;
    private ProgressBar progressBar;
    private SeekBar seekBar;

    SharedPreferences LastCal;
    SharedPreferences LastProtein;
    SharedPreferences LastCarb;
    SharedPreferences LastFat;
    SharedPreferences LastSodium;
    SharedPreferences LastSugar;

    SharedPreferences.Editor CalEditor;
    SharedPreferences.Editor ProteinEditor;
    SharedPreferences.Editor CarbEditor;
    SharedPreferences.Editor FatEditor;
    SharedPreferences.Editor SodiumEditor;
    SharedPreferences.Editor SugarEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.text_view_progress);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        LastCal = getSharedPreferences("CalLastSetting", Context.MODE_PRIVATE);
        LastProtein = getSharedPreferences("ProteinLastSetting", Context.MODE_PRIVATE);
        LastCarb = getSharedPreferences("CarbLastSetting", Context.MODE_PRIVATE);
        LastFat = getSharedPreferences("FatLastSetting", Context.MODE_PRIVATE);
        LastSodium = getSharedPreferences("SodiumLastSetting", Context.MODE_PRIVATE);
        LastSugar = getSharedPreferences("CalLastSetting", Context.MODE_PRIVATE);

        CalEditor=LastCal.edit();
        ProteinEditor=LastProtein.edit();
        CarbEditor=LastCarb.edit();
        FatEditor=LastFat.edit();
        SodiumEditor=LastSodium.edit();
        SugarEditor=LastSugar.edit();
        final int LastClickCal = LastCal.getInt("CalLastClick", 0);
        final int LastClickProtein = LastProtein.getInt("ProteinLastClick", 0);
        final int LastClickCarb = LastCarb.getInt("CarbLastClick", 0);
        final int LastClickFat = LastFat.getInt("FatLastClick", 0);
        final int LastClickSodium = LastSodium.getInt("SodiumLastClick", 0);
        final int LastClickSugar = LastSugar.getInt("SugarLastClick", 0);



        final List<Integer> CalList = new ArrayList<>();
        CalList.add(20);
        CalList.add(210);
        CalList.add(220);
        CalList.add(230);

        final List<Integer> ProteinList = new ArrayList<>();
        ProteinList.add(50);
        ProteinList.add(60);
        ProteinList.add(70);
        ProteinList.add(80);
        ProteinList.add(90);
        ProteinList.add(100);
        ProteinList.add(150);
        ProteinList.add(160);
        ProteinList.add(170);
        ProteinList.add(180);

        final List<Integer> CarbList = new ArrayList<>();
        CarbList.add(220);
        CarbList.add(230);
        CarbList.add(240);
        CarbList.add(250);
        CarbList.add(260);
        CarbList.add(270);
        CarbList.add(280);
        CarbList.add(290);
        CarbList.add(300);
        CarbList.add(320);
        CarbList.add(330);

        final List<Integer> FatList = new ArrayList<>();
        FatList.add(40);
        FatList.add(45);
        FatList.add(50);
        FatList.add(55);
        FatList.add(60);
        FatList.add(65);
        FatList.add(70);
        FatList.add(75);

        final List<Integer> SodiumList = new ArrayList<>();
        SodiumList.add(1500);
        SodiumList.add(1600);
        SodiumList.add(1700);
        SodiumList.add(1800);
        SodiumList.add(1900);
        SodiumList.add(2000);
        SodiumList.add(2100);
        SodiumList.add(2200);
        SodiumList.add(2300);

        final List<Integer> SugarList = new ArrayList<>();
        SugarList.add(20);
        SugarList.add(25);
        SugarList.add(30);
        SugarList.add(35);

        ArrayAdapter CalAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item, CalList);
        ArrayAdapter ProteinAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item, ProteinList);
        ArrayAdapter CarbAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item, CarbList);
        ArrayAdapter FatAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item, FatList);
        ArrayAdapter SodiumAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item, SodiumList);
        ArrayAdapter SugarAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item, SugarList);

        /*Spinner CalSpinner = findViewById(R.id.Calspinner);
        CalSpinner.setAdapter(CalAdapter);
        CalSpinner.setSelection(LastClickCal);

        CalSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                CalEditor.putInt("CalLastClick", position).commit();
                ((TextView) parent.getChildAt(0)).setTextSize(45);
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
                //CalList.get(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });*/

        Spinner ProteinSpinner = findViewById(R.id.Proteinspinner);
        ProteinSpinner.setAdapter(ProteinAdapter);
        ProteinSpinner.setSelection(LastClickProtein);

        ProteinSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                ProteinEditor.putInt("ProteinLastClick", position).commit();
                ((TextView) parent.getChildAt(0)).setTextSize(45);
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
                //CalList.get(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        Spinner CarbSpinner = findViewById(R.id.Carbspinner);
        CarbSpinner.setAdapter(CarbAdapter);
        CarbSpinner.setSelection(LastClickCarb);

        CarbSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                CarbEditor.putInt("CarbLastClick", position).commit();
                ((TextView) parent.getChildAt(0)).setTextSize(45);
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
                //CalList.get(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        Spinner FatSpinner = findViewById(R.id.Fatspinner);
        FatSpinner.setAdapter(FatAdapter);
        FatSpinner.setSelection(LastClickFat);

        FatSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                FatEditor.putInt("FatLastClick", position).commit();
                ((TextView) parent.getChildAt(0)).setTextSize(45);
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
                //CalList.get(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                textView1.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        

        Spinner SodiumSpinner = findViewById(R.id.Sodiumspinner);
        SodiumSpinner.setAdapter(SodiumAdapter);
        SodiumSpinner.setSelection(LastClickSodium);

        SodiumSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                SodiumEditor.putInt("SodiumLastClick", position).commit();
                ((TextView) parent.getChildAt(0)).setTextSize(45);
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
                //CalList.get(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        Spinner SugarSpinner = findViewById(R.id.Sugarspinner);
        SugarSpinner.setAdapter(SugarAdapter);
        SugarSpinner.setSelection(LastClickSugar);

        SugarSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                SugarEditor.putInt("SugarLastClick", position).commit();
                ((TextView) parent.getChildAt(0)).setTextSize(45);
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
                //CalList.get(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });

        FloatingActionButton addFood;
        addFood = (FloatingActionButton) findViewById(R.id.addFood);
        addFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, search.class));
            }
        });

        ImageButton settingButton;
        settingButton = (ImageButton) findViewById(R.id.imageButton);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Setting.class));
            }
        });
    }
}

