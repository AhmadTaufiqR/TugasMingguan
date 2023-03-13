package com.taufiq.aplicationtest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePickerDialog picker;
    EditText Etext;
    EditText etextnama;
    EditText etextalamat;
    Button btn;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Etext = findViewById(R.id.Tanggal);
        Etext.setInputType(InputType.TYPE_NULL);
        Etext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);

                // Tampilan Date Picker Dialog
                picker = new DatePickerDialog(getApplicationContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker View, int year, int monthOfYear, int dayOfMonth) {
                        Etext.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                }, year, month, day);
                picker.show();
            }

        });

        btn = findViewById(R.id.Submit_button);
        etextnama = findViewById(R.id.Nama);
        etextalamat = findViewById(R.id.alamat);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etextnama.getText().toString();
                String tanggal = Etext.getText().toString();
                String alamat = etextalamat.getText().toString();

                Toast.makeText(getApplicationContext(), "Halo, " + name + "!," +
                        " " + "Kamu Berasal Dari " + alamat + " Dan Tanggal Lahir Kamu "
                        + tanggal, Toast.LENGTH_LONG).show();

            }
        });
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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