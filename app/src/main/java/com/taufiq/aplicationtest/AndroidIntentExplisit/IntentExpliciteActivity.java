package com.taufiq.aplicationtest.AndroidIntentExplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.taufiq.aplicationtest.FragmentAstivity;
import com.taufiq.aplicationtest.IntentCoding.IntentActivity;
import com.taufiq.aplicationtest.ListCountriesActivity;
import com.taufiq.aplicationtest.MainActivity;
import com.taufiq.aplicationtest.R;
import com.taufiq.aplicationtest.RecycleViewActivity;

public class IntentExpliciteActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicite);

        btn1 = findViewById(R.id.buttonList);
        btn2 = findViewById(R.id.buttonFrag);
        btn3 = findViewById(R.id.buttonLog);
        btn4 = findViewById(R.id.buttonRecy);
        btn5 = findViewById(R.id.buttonImplisit);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(IntentExpliciteActivity.this, ListCountriesActivity.class);
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(IntentExpliciteActivity.this, FragmentAstivity.class);
                startActivity(intent2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(IntentExpliciteActivity.this, MainActivity.class);
                startActivity(intent3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(IntentExpliciteActivity.this, RecycleViewActivity.class);
                startActivity(intent4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(IntentExpliciteActivity.this, IntentActivity.class);
                startActivity(intent5);
            }
        });

    }


}