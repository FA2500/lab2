package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button listButton;
    Button gridButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listButton = (Button)findViewById(R.id.listButton);

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.listview_activity);
                Intent listAct = new Intent(view.getContext() , ZeroFrag.class);
                startActivity(listAct);
            }
        });
        {

        }

        gridButton = (Button)findViewById(R.id.gridButton);

        gridButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.gridview_activity);
                Intent gridAct = new Intent(view.getContext() , FirstFrag.class);
                startActivity(gridAct);
            }
        });
        {

        }
    }
}