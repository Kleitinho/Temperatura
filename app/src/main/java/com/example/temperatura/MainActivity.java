package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCelFah, btnCelKel, btnFahCel, btnFahKel, btnKelCel, btnKelFah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCelFah = findViewById(R.id.button);
        btnCelKel = findViewById(R.id.button2);
        btnFahCel = findViewById(R.id.button3);
        btnFahKel = findViewById(R.id.button4);
        btnKelCel = findViewById(R.id.button5);
        btnKelFah = findViewById(R.id.button6);

        btnCelFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent itCelFah = new Intent(MainActivity.this, TelaCelFah.class);
                startActivity(itCelFah);
            }
        });

        btnCelKel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent itCelKel = new Intent(MainActivity.this, TelaCelKel.class);
                startActivity(itCelKel);
            }
        });

        btnFahCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent itFahCel = new Intent(MainActivity.this, TelaFahCel.class);
                startActivity(itFahCel);
            }
        });

        btnFahKel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent itFahKel = new Intent(MainActivity.this, TelaFahKel.class);
                startActivity(itFahKel);
            }
        });

        btnKelCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent itKelCel = new Intent(MainActivity.this, TelaKelCel.class);
                startActivity(itKelCel);
            }
        });

        btnKelFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent itKelFah = new Intent(MainActivity.this, TelaKelFah.class);
                startActivity(itKelFah);
            }
        });
    }
}