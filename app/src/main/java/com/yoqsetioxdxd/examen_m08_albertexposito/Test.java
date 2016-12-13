package com.yoqsetioxdxd.examen_m08_albertexposito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Test {

    private ArrayList<Pregunta> llistaPreguntes = new ArrayList();
    private int numeroPreguntes;
    private int tema;

    public Test(int numeroPreguntes, int tema) {
        this.numeroPreguntes = numeroPreguntes;
        this.tema = tema;
    }

    void obtenirPreguntes(int tema, int numeroPreguntes) {

        for (int cont = 0; cont < numeroPreguntes; cont++) {
            llistaPreguntes.add(new Pregunta("Pregunta número: " + cont + " Quan fan 2 + 2?", 4));
        }
    }

    public ArrayList<Pregunta> getLlistaPreguntes() {
        return llistaPreguntes;
    }
}
