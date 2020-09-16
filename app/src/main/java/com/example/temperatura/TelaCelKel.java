package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaCelKel extends AppCompatActivity {

    TextView textViewKel;
    EditText editTextCel;
    Button btnConverter, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cel_kel);

        textViewKel = findViewById(R.id.textViewFah);

        editTextCel = findViewById(R.id.editTextCel);

        btnConverter = findViewById(R.id.btnConverter1);
        btnLimpar = findViewById(R.id.btnLimpar1);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float cel;
                float kel;
                double valor1;
                cel = Float.parseFloat(editTextCel.getText().toString());

                valor1 = 273.15;
                kel = (float) (cel + valor1);

                textViewKel.setText(cel + " em celsius é igual a: " + kel + " em kelvin");
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextCel.setText(null);
                textViewKel.setText("--");
                editTextCel.requestFocus();
            }
        });
    }
}