package com.taufiq.aplicationtest.AndroidIntentExplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.taufiq.aplicationtest.R;

public class SecondExpliciteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_explicite);
    }
}