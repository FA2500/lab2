package com.example.lab2;


import androidx.annotation.Nullable;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class FirstFrag extends Activity {

    GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_activity);

        gridView = (GridView) findViewById((R.id.gridview));
        gridView.setAdapter(new ImageAdapter(this));

        //onclick event
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                i.putExtra("id",position);
                startActivity(i);
            }
        });
    }





}
