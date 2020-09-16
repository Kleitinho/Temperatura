package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaFahCel extends AppCompatActivity {

    EditText editTextFah;
    TextView textViewCel;
    Button btnLimpar1, btnConverter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fah_cel);

        editTextFah = findViewById(R.id.editTextCel);

        textViewCel = findViewById(R.id.textViewFah);

        btnConverter1 = findViewById(R.id.btnConverter1);
        btnLimpar1 = findViewById(R.id.btnLimpar1);

        btnConverter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View){
                float fah, cel;
                fah = Float.parseFloat(editTextFah.getText().toString());

                cel = ( fah - 32 ) * 5 / 9;

                textViewCel.setText(fah + " em fahrenheit é igual a: " + cel + " em celsius ");
            }
        });
        btnLimpar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextFah.setText(null);
                textViewCel.setText("--");
                editTextFah.requestFocus();
            }
        });
    }
}