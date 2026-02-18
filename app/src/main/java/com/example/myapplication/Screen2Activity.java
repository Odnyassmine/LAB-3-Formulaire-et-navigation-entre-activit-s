package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView tvRecap = findViewById(R.id.tvRecap);
        Button btnRetour = findViewById(R.id.btnRetour);

        // Récupérer les données
        String nom = getIntent().getStringExtra("nom");
        String email = getIntent().getStringExtra("email");
        String tel = getIntent().getStringExtra("tel");
        String residence = getIntent().getStringExtra("residence");
        String localite = getIntent().getStringExtra("localite");

        String recap = "Nom : " + nom +
                "\nEmail : " + email +
                "\nTéléphone : " + tel +
                "\nRésidence : " + residence +
                "\nLocalité : " + localite;

        tvRecap.setText(recap);

        btnRetour.setOnClickListener(v -> finish());
    }
}