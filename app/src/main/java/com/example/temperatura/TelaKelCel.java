package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaKelCel extends AppCompatActivity {

    EditText editTextKel;
    TextView textViewCel;
    Button btnConverter, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_kel_cel);

        editTextKel = findViewById(R.id.editTextCel);

        textViewCel = findViewById(R.id.textViewFah);

        btnConverter = findViewById(R.id.btnConverter1);
        btnLimpar = findViewById(R.id.btnLimpar1);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float kel, cel, valor1;
                valor1 = (float) -273.15;

                kel = Float.parseFloat(editTextKel.getText().toString());

                cel = kel - valor1;

                textViewCel.setText(kel + " em kelvin é igual a: " + cel + " em celsius ");
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextKel.setText(null);
                textViewCel.setText("--");
                editTextKel.requestFocus();
            }
        });
    }
}