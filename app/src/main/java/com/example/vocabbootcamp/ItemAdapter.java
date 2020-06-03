package com.example.vocabbootcamp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] lessons;
    String[] theme;

    public ItemAdapter(Context c, String[] l, String[] t){
        lessons = l;
        theme = t;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return lessons.length;
    }

    @Override
    public Object getItem(int position) {
        return lessons[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.lesson_list, null);
        TextView chapterTextView = v.findViewById(R.id.chapter);
        TextView themeTextView = v.findViewById(R.id.theme);

        String chapter = lessons[position];
        String themeview = theme[position];

        chapterTextView.setText(chapter);
        themeTextView.setText(themeview);

        return v;
    }
}
