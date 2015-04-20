package com.imufun.imran.listview_imgview_layinf_view_viewgrp_more;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by imran on 4/20/15.
 */
public class MyAdapter extends ArrayAdapter<String> {


    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_img, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // The LayoutInflator puts a layout into the right View

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        // inflate takes the resource to load, the parent that the resource may be
        // loaded into and true or false if we are loading into a parent view.

        View theView = layoutInflater.inflate(R.layout.row_layout_img, parent, false);

        // We retrieve the text from the array

        String tvShow = getItem(position);

        // Get the TextView we want to edit
        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        // Put the next TV Show into the TextView

        theTextView.setText(tvShow);

        // Get the ImageView in the layout
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);

        // We can set a ImageView like this
        theImageView.setImageResource(R.drawable.dot);

        return theView;

    }
}
