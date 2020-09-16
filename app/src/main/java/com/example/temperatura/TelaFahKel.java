package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaFahKel extends AppCompatActivity {

    EditText editTextFah;
    TextView textViewKel;
    Button btnConverter, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fah_kel);

        editTextFah = findViewById(R.id.editTextCel);

        textViewKel = findViewById(R.id.textViewFah);

        btnConverter = findViewById(R.id.btnConverter1);
        btnLimpar = findViewById(R.id.btnLimpar1);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float fah;
                float kel;
                double valor1;
                valor1 = 273.15;
                fah = Float.parseFloat(editTextFah.getText().toString());

                kel = (float) (( fah - 32 ) * 5 / 9 + valor1);

                textViewKel.setText(fah + " em fahrenheit é igual a: " + kel + " em kelvin ");
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextFah.setText(null);
                textViewKel.setText("--");
                editTextFah.requestFocus();
            }
        });
    }
}