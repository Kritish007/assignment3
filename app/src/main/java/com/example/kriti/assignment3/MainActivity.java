package com.example.kriti.assignment3;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //String value;
    String[] settingsList = {"Enable power saving", "Enable fail-safe",
                             "Auto power off your device", "Enable offline-mode",
                             "Enable stable capture"}; // Names of the settings
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView); // Brings up the listView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), settingsList); //settingsList is parsed to CustomAdapter
        listView.setAdapter(customAdapter); //Set adapter according to the listView
    }
}