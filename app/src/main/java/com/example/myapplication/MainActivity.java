package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNom, etEmail, etTelephone, etResidence, etLocalite;
    Button btnValider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNom = findViewById(R.id.etNom);
        etEmail = findViewById(R.id.etEmail);
        etTelephone = findViewById(R.id.etTelephone);
        etResidence = findViewById(R.id.etResidence);
        etLocalite = findViewById(R.id.etLocalite);
        btnValider = findViewById(R.id.btnValider);

        btnValider.setOnClickListener(v -> {

            String nom = etNom.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String tel = etTelephone.getText().toString().trim();
            String residence = etResidence.getText().toString().trim();
            String localite = etLocalite.getText().toString().trim();

            if (nom.isEmpty() || email.isEmpty()) {
                etNom.setError("Champ obligatoire");
                return;
            }

            Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
            intent.putExtra("nom", nom);
            intent.putExtra("email", email);
            intent.putExtra("tel", tel);
            intent.putExtra("residence", residence);
            intent.putExtra("localite", localite);

            startActivity(intent);
        });
    }
}