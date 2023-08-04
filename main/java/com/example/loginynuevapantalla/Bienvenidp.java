package com.example.loginynuevapantalla;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bienvenidp extends AppCompatActivity {
    private TextView textViewBienvenido;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvendioestilo);

        textViewBienvenido = findViewById(R.id.textViewBienvenido);

        String username = getIntent().getStringExtra("username");


        textViewBienvenido.setText("Bienvenido, " + username + "!");
    }
}

