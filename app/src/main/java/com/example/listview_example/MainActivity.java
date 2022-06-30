package com.example.listview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        String[] colors = {"Blue", "Red", "Green", "Pink", "Orange", "Black", "Yellow", "White"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.item, colors);

        listView.setAdapter(adapter);
    }
}