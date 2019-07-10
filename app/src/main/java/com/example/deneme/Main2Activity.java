package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String adSoyad = getIntent().getStringExtra("AdSoyad");
        TextView textViewAdSoyad = findViewById(R.id.textView);
        textViewAdSoyad.setText("Hoşgeldin " + adSoyad);
    }
}
