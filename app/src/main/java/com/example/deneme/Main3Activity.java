package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText editTextAdSoyad;
    EditText editTextKullanıcıAdı;
    EditText editTextPassword;
    EditText EditTextPassword2;
    Button buttonUyeOl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editTextAdSoyad = findViewById(R.id.editTextAdSoyad);
        editTextKullanıcıAdı = findViewById(R.id.editTextKullanıcıAdı);
        editTextPassword = findViewById(R.id.editTextPassword);
        EditTextPassword2= findViewById(R.id.editTextPassword2);
        buttonUyeOl = findViewById(R.id.UyeOl);

        buttonUyeOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                intent.putExtra("adsoyad",editTextAdSoyad.getText().toString());
                startActivity(intent);
});
}
}}