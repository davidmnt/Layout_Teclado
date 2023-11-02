package com.example.layout_teclado.Teclados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.layout_teclado.R;

public class DistintosTecladosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distintos_teclados);
        Button numerico = findViewById(R.id.TecladoTelefono);
        Button numerico1 = findViewById(R.id.TecladoNumeros);
        Button normal = findViewById(R.id.numerico1);
        Button numerico2 = findViewById(R.id.numerico2);

        numerico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandarNumerico();
            }
        });

        numerico1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandarNumeros();
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandarDatos();
            }
        });

        numerico2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandarNumerico2();
            }
        });


    }

    private void mandarNumerico(){
        Intent i = new Intent(this, TecladoNumericoActivity.class);
        startActivity(i);
    }
    private void mandarNumeros(){
        Intent i = new Intent(this, TecladoNumerosActivity.class);
        startActivity(i);
    }

    private void mandarDatos(){
        Intent i = new Intent(this, TecladoNormalActivity.class);
        startActivity(i);
    }

    private void mandarNumerico2(){
        Intent i = new Intent(this, TecladoNumerico2Activity.class);
        startActivity(i);
    }


}