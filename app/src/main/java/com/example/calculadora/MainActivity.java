package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado1, textResultado2, textResultado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado1 = findViewById(R.id.resultado1);
        textResultado2 = findViewById(R.id.resultado2);
        textResultado3 = findViewById(R.id.resultado3);


    }


    public void btnSumar(View view) {
        Calculadora calculadora = new Calculadora();
        int resultado1 = calculadora.sumar(40, 5);
        int resultado2 = calculadora.sumar(50, 19, 15);
        int[] numeros = {50, 10, 5, 2, 1};
        int resultado3 = calculadora.sumar(numeros);

        textResultado1.setText(String.valueOf(resultado1));
        textResultado2.setText(String.valueOf(resultado2));
        textResultado3.setText(String.valueOf(resultado3));
    }

    public void btnRestar(View view) {
        Calculadora calculadora = new Calculadora();
        int resultado1 = calculadora.restar(40, 5);
        int resultado2 = calculadora.restar(50, 19, 15);
        int[] numeros = {50, 10, 5, 2, 1};
        int resultado3 = calculadora.restar(numeros);

        textResultado1.setText(String.valueOf(resultado1));
        textResultado2.setText(String.valueOf(resultado2));
        textResultado3.setText(String.valueOf(resultado3));
    }

    public void btnMulti(View view) {
        Calculadora calculadora = new Calculadora();
        int resultado1 = calculadora.multiplicar(40, 5);
        int resultado2 = calculadora.multiplicar(50, 19, 15);
        int[] numeros = {50, 10, 5, 2, 1};
        int resultado3 = calculadora.multiplicar(numeros);

        textResultado1.setText(String.valueOf(resultado1));
        textResultado2.setText(String.valueOf(resultado2));
        textResultado3.setText(String.valueOf(resultado3));
    }


    public void btnDiv(View view) {
        Calculadora calculadora = new Calculadora();
        double resultado1 = calculadora.dividir(40, 5);
        double resultado2 = calculadora.dividir(50, 19, 15);
        int[] numeros = {50, 10, 5, 2, 1};
        double resultado3 = calculadora.dividir(numeros);

        textResultado1.setText(String.valueOf(resultado1));
        textResultado2.setText(String.valueOf(resultado2));
        textResultado3.setText(String.valueOf(resultado3));
    }

}