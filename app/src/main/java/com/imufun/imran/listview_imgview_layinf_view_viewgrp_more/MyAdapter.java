package com.imufun.imran.listview_imgview_layinf_view_viewgrp_more;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by imran on 4/20/15.
 */
public class MyAdapter extends ArrayAdapter<String> {


    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_img, values);
    }
}
