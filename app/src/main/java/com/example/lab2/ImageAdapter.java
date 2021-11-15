package com.example.lab2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.anemo, R.drawable.geo, R.drawable.electro,
            R.drawable.dendro, R.drawable.hydro, R.drawable.pyro,
            R.drawable.cryo
    };

    public ImageAdapter(Context c)
    {
        mContext = c;
    }

    public int getCount()
    {
        return thumbImages.length;
    }

    public Object getItem(int position)
    {
        return null;
    }

    public long getItemId(int position)
    {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
