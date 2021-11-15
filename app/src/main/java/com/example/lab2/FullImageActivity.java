package com.example.lab2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicReference;

public class FullImageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        //get intent data
        Intent i = getIntent();
        //get selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.thumbImages[position]);

        Resources res = getResources();
        String[] element = res.getStringArray(R.array.Visions);

        MediaPlayer mp = null;
        switch (position)
        {
            case 0:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.anemom);
                break;
            case 1:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.geom);
                break;
            case 2:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.electrom);
                break;
            case 3:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.dendrom);
                break;
            case 4:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.hydrom);
                break;
            case 5:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.pyrom);
                break;
            case 6:
                mp = MediaPlayer.create(getApplicationContext(), R.raw.cryom);
                break;
        }


        Context context = getApplicationContext();
        CharSequence text = "Image position : "+position + "\nVision = "+element[position];
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
        mp.start();
    }
}
