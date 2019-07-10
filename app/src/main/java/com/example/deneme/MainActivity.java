package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PackageInfoCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    TextView textViewAdsoyad;
    EditText editTextAdSoyad;
    ImageView imageViewProfilFoto;
    Button buttonSetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewAdsoyad = findViewById(R.id.textViewAdSoyad);
        editTextAdSoyad = findViewById(R.id.editTextAdSoyad);
        imageViewProfilFoto = findViewById(R.id.imageViewProfilFoto);
        buttonSetText = findViewById(R.id.buttonSetText);

        buttonSetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("AdSoyad",editTextAdSoyad.getText().toString() );
                startActivity(intent);
            }
        });
    }
}
