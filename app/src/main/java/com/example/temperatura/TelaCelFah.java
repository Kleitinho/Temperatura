package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaCelFah extends AppCompatActivity {

    EditText editTextCel;
    TextView textViewFah;
    Button btnLimpar1, btnConverter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cel_fah);

        editTextCel = findViewById(R.id.editTextCel);

        textViewFah = findViewById(R.id.textViewFah);

        btnLimpar1 = findViewById(R.id.btnLimpar1);
        btnConverter1 = findViewById(R.id.btnConverter1);

        btnConverter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float cel, fah;
                cel = Float.parseFloat(editTextCel.getText().toString());

                fah = ( cel * 9 / 5 ) + 32;

                textViewFah.setText(cel + " em celsius é igual a: " + fah + " em fahrenheit");
            }
        });
        btnLimpar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextCel.setText(null);
                textViewFah.setText("--");
                editTextCel.requestFocus();
            }
        });
    }
}