package com.yoqsetioxdxd.examen_m08_albertexposito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button BTN_comencar;
    private EditText ET_nom;
    private String nom;
    private int tipus;
    private int numero;

    private RadioButton sumes;
    private RadioButton restes;
    private RadioButton multi;
    private RadioButton div;
    private RadioButton general;

    private RadioButton preg5;
    private RadioButton preg10;
    private RadioButton preg20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTN_comencar = (Button) findViewById(R.id.btn_comencar);

        sumes = (RadioButton) findViewById(R.id.radio_sumes);
        restes = (RadioButton) findViewById(R.id.radio_restes);
        multi = (RadioButton) findViewById(R.id.radio_multi);
        div = (RadioButton) findViewById(R.id.radio_div);
        general = (RadioButton) findViewById(R.id.radio_general);

        preg5 = (RadioButton) findViewById(R.id.radio_num_5);
        preg10 = (RadioButton) findViewById(R.id.radio_num_10);
        preg20 = (RadioButton) findViewById(R.id.radio_num_20);

        sumes.setChecked(true);
        preg5.setChecked(true);

        BTN_comencar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_comencar) {

            //GET NOMBRE
            ET_nom = (EditText) findViewById(R.id.ET_nomAlumne);
            nom = ET_nom.getText().toString();

            if (sumes.isChecked()) {
                tipus = 1;
            } else if (restes.isChecked()) {
                tipus = 2;
            } else if (multi.isChecked()) {
                tipus = 3;
            } else if (div.isChecked()) {
                tipus = 4;
            } else if (general.isChecked()) {
                tipus = 0;
            }


            if (preg5.isChecked()) {
                numero = 1;
            } else if (preg10.isChecked()) {
                numero = 2;
            } else if (preg20.isChecked()) {
                numero = 3;
            }

            Intent intent = new Intent(this, TestActivity.class);

            intent.putExtra("NOM", nom);
            intent.putExtra("TIPUS", tipus);
            intent.putExtra("NUMERO", numero);
            startActivityForResult(intent, 1);
        }
    }

    public void onRadioButtonClicked(View v){

    }
}
