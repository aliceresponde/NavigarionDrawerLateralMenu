package com.example.aliceresponde.defaultlateralmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by alice on 3/25/16.
 */
public class CurrentListAdapter extends BaseAdapter{
    private Context context;


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    private class ListHolder{
        private TextView tv_list_tile;
        private TextView tv_list_total;
    }
}
