package com.yoqsetioxdxd.examen_m08_albertexposito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    private Test test;
    private int numPreguntes;
    private int tema;

    //TODO INICIALITZAR ELS ITEMS DEL LAYOUT, MOSTRAR EL STRING DE LA PREGUNTA AL TEXT VIEW I
    // COMPROVAR SI A L'INTRODUIR UN NOMBRE ES IGUAL AL GET DE LA RESPOSTA DE PREGUNTA,
    // SI ES CORRECTE SUMA 1 AL CONTADOR DE CORRECTES I ACTUALITZA EL TEXT VIEW DE CORRECTES,
    // SI  ES INCORRECTE SUMA 1 AL NEGATIU. QUAN S'HAN REALITZAT OTTES LES PREGUNTES FA L'INTENT A LA'CTIVITY RESULTATS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        numPreguntes = getIntent().getIntExtra("NUMERO",0);
        tema = getIntent().getIntExtra("TIPUS",0);

        test = new Test(numPreguntes, tema);


    }
}
