package com.aitorsantana.primerejerciciopgl;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Rkakitan", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        contexto = this;

        //----------------------RADIOGROUP Y RADIOBUTTONS-------------------------//

        final RadioGroup encuesta = (RadioGroup) findViewById(R.id.radiogroupEncuesta);
        encuesta.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String mensajeToast = null;
                switch (checkedId){
                    case R.id.radioButtonEncuesta1:
                        mensajeToast = "¡¡ESPAÑOL!!";
                        break;
                    case R.id.radioButtonEncuesta2:
                        mensajeToast = "¡¡FRANCÉS!!";
                        break;
                    case R.id.radioButtonEncuesta3:
                        mensajeToast = "¡¡CHINO!!";
                        break;
                    case R.id.radioButtonEncuesta4:
                        mensajeToast = "¡¡MEXICANO!!";
                        break;
                    case R.id.radioButtonEncuesta5:
                        mensajeToast = "¡¡AUSTRALIANO!!";
                        break;
                }
                Toast.makeText(contexto, mensajeToast, Toast.LENGTH_SHORT).show();
            }
        });

        //-----------------------CHECKBOX + BOTÓN ENVIAR-------------------------//
        final CheckBox confirmarEnvio = (CheckBox) findViewById(R.id.checkboxConfirmar);

        final Button confirmarElEnvio = (Button) findViewById(R.id.buttonEnviar);
        confirmarElEnvio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (confirmarEnvio.isChecked()) {
                    final String mensaje = "Gracias por colaborar";
                    Toast.makeText(contexto, mensaje, Toast.LENGTH_LONG).show();
                } else {
                    final String text = "Debes aceptar la Política de Privacidad";
                    Toast.makeText(contexto, text, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
