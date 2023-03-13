package com.taufiq.aplicationtest;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        List<item> items = new ArrayList<item>();

        items.add(new item("Taufiq", "taufiq@gmail.com",R.drawable.circle2));
        items.add(new item("Budi", "budi@gmail.com",R.drawable.circle));
        items.add(new item("Mobila", "mobila@gmail.com",R.drawable.circle3));
        items.add(new item("Hape", "hape@gmail.com",R.drawable.circle3));
        items.add(new item("Lapitop", "lapitop@gmail.com",R.drawable.circle3));
        items.add(new item("Monitore", "monitore@gmail.com",R.drawable.circle3));
        items.add(new item("Mose", "mose@gmail.com",R.drawable.circle3));
        items.add(new item("Oppa", "oppa@gmail.com",R.drawable.circle3));
        items.add(new item("Samisung", "samisung@gmail.com",R.drawable.circle3));
        items.add(new item("Papani", "papani@gmail.com",R.drawable.circle3));
        items.add(new item("Roni", "roni@gmail.com",R.drawable.circle3));
        items.add(new item("Deo", "deo@gmail.com",R.drawable.circle3));
        items.add(new item("Ibrar", "ibrar@gmail.com",R.drawable.circle3));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}