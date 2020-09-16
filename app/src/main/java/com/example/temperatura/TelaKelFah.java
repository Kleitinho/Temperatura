package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaKelFah extends AppCompatActivity {

    EditText editTextKel;
    TextView textViewFah;
    Button btnConverter, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_kel_fah);

        editTextKel = findViewById(R.id.editTextCel);

        textViewFah = findViewById(R.id.textViewFah);

        btnConverter = findViewById(R.id.btnConverter1);
        btnLimpar = findViewById(R.id.btnLimpar1);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float kel, fah, valor1;
                valor1 = (float) 273.15;
                kel = Float.parseFloat(editTextKel.getText().toString());
                fah = ( kel - valor1 ) * 9 / 5 + 32;

                textViewFah.setText(kel + " em kelvins é igual a: " + fah + " em fahrenheit ");
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextKel.setText(null);
                textViewFah.setText("--");
                editTextKel.requestFocus();
            }
        });
    }
}