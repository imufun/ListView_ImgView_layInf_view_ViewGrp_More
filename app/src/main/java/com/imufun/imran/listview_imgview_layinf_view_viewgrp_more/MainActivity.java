package com.imufun.imran.listview_imgview_layinf_view_viewgrp_more;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //textview=(TextView)findViewById(R.id.textView1);

        // Simple array with a list of my favorite TV shows
        String[] MyTvShow = {
                "Pushing Daisies", "Better Off Ted", "Twin Peaks", "Freaks and Geeks", "Orphan Black", "Walking Dead",
                "Breaking Bad", "The 400", "Alphas", "game", "O07", "rider", "Android", "Php", "Java", "First", "Alphas", "ম্যাপ", "Alphas", "Alphas", "Alphas", "Alphas", "Alphas", "Life on Mars"
        };


        // -The ListAdapter acts as a bridge between the data and each ListItem
        // -You fill the ListView with a ListAdapter. You pass it a context represented by
        // -this. A Context provides access to resources you need.
        // -android.R.layout.simple_list_item_1 is one of the resources needed.
        // -It is a predefined layout provided by Android that stands in as a default


        ListAdapter listAdapter = new MyAdapter(this, MyTvShow);

        // ListViews display data in a scrollable list
        ListView listView = (ListView) findViewById(R.id.thelistView);

        // Tells the ListView what data to use
        listView.setAdapter(listAdapter); //set adapter to string array


        //

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tvShow = " You Selected " + String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this, tvShow, Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
