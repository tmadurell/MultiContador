package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
//Variable de numero que hay en cada uno del contador
    int contador1;
    int contador2;
    int contador3;
    int contador4;

//Numeros que indica que muestra y hay en pantalla en total contados
    TextView contadorDeClics;
    TextView contadorDeClics1;
    TextView contadorDeClics2;
    TextView contadorDeClics3;
    TextView contadorDeClics4;

//Boton para dar suma una por una y los junta en el contador, hasta llegar infinito
    Button augmentarElContador1;
    Button augmentarElContador2;
    Button augmentarElContador3;
    Button augmentarElContador4;

//Boton que reinicia todos y de manera individual a los numeros que se han contado en el contador dejandolo en 0
    Button resetContadorTodo;
    Button resetContador1;
    Button resetContador2;
    Button resetContador3;
    Button resetContador4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorDeClics = findViewById(R.id.contadorALL);
        contadorDeClics1 = findViewById(R.id.contadorDeClics1);
        contadorDeClics2 = findViewById(R.id.contadorDeClics2);
        contadorDeClics3 = findViewById(R.id.contadorDeClics3);
        contadorDeClics4 = findViewById(R.id.contadorDeClics4);

        augmentarElContador1 = findViewById(R.id.augmentarElContador1);
        augmentarElContador2 = findViewById(R.id.augmentarElContador2);
        augmentarElContador3 = findViewById(R.id.augmentarElContador3);
        augmentarElContador4 = findViewById(R.id.augmentarElContador4);

        resetContadorTodo = findViewById(R.id.resetALL);
        resetContador1 = findViewById(R.id.resetContador1);
        resetContador2 = findViewById(R.id.resetContador2);
        resetContador3 = findViewById(R.id.resetContador3);
        resetContador4 = findViewById(R.id.resetContador4);

        augmentarElContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
                contadorDeClics1.setText(String.valueOf(contador1));
            }

        });

        augmentarElContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
                contadorDeClics2.setText(String.valueOf(contador2));
            }
        });
        augmentarElContador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
                contadorDeClics3.setText(String.valueOf(contador3));
            }
        });
        augmentarElContador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
                contadorDeClics4.setText(String.valueOf(contador4));
            }
        });


        resetContadorTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1=0;
                contador2=0;
                contador3=0;
                contador4=0;
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
                contadorDeClics1.setText((String.valueOf(contador1)));
                contadorDeClics2.setText(String.valueOf(contador2));
                contadorDeClics3.setText(String.valueOf(contador3));
                contadorDeClics4.setText(String.valueOf(contador4));
            }
        });

        resetContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1=0;
                contadorDeClics1.setText((String.valueOf(contador1)));
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
            }
        });

        resetContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2=0;
                contadorDeClics2.setText((String.valueOf(contador2)));
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));

            }
        });

        resetContador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3=0;
                contadorDeClics3.setText((String.valueOf(contador3)));
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
            }
        });

        resetContador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4=0;
                contadorDeClics4.setText((String.valueOf(contador4)));
                contadorDeClics.setText(String.valueOf(contador1 + contador2 + contador3 +contador4));
            }
        });
    }
}