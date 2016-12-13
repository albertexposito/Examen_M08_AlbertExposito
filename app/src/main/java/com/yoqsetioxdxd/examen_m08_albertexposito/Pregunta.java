package com.yoqsetioxdxd.examen_m08_albertexposito;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class Pregunta {
    private String str_pregunta;
    private int resultat;

    public Pregunta(String str_pregunta, int resultat) {
        this.str_pregunta = str_pregunta;
        this.resultat = resultat;
    }

    public int getResultat() {
        return resultat;
    }

    public String getStr_pregunta() {
        return str_pregunta;
    }
}
