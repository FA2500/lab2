package com.example.lab2;

import androidx.annotation.Nullable;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ZeroFrag extends Activity {

    ListView listView;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_activity);

        listView = (ListView)findViewById(R.id.listView);

        String[] values = new String[]
                {
                        "Anemo",
                        "Geo",
                        "Electro",
                        "Dendro",
                        "Hydro",
                        "Pyro",
                        "Cryo"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1,values);

        listView.setAdapter(adapter);


    }

}
