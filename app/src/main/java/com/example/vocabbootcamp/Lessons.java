package com.example.vocabbootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

public class Lessons extends AppCompatActivity {
    ListView lessonList;
    String[] chapter;
    String[] theme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        Resources res = getResources();

        lessonList = (ListView) findViewById(R.id.lessonList);
        chapter = res.getStringArray(R.array.lessons);
        theme = res.getStringArray(R.array.theme);

        ItemAdapter itemAdapter = new ItemAdapter(this, chapter, theme);
        lessonList.setAdapter(itemAdapter);


    }
}