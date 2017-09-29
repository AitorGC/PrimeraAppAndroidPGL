package com.aitorsantana.primerejerciciopgl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //-----------------------------------------//


        Switch switchImagen = (Switch) findViewById(R.id.switchImagen);
        final TextView textSegundaPantalla = (android.widget.TextView) findViewById(R.id.SecondScreen);
        final ImageView imageViewPro = (ImageView) findViewById(R.id.imageViewProff);

        switchImagen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                //textp.setText(isChecked ? "Eres un macarra" : "Eres motero");

                if (isChecked){
                    textSegundaPantalla.setText("Eres un macarra");
                    imageViewPro.setImageResource(R.drawable.coche);
                }else {
                    textSegundaPantalla.setText("Eres motero");
                    imageViewPro.setImageResource(R.drawable.moto);
                }
            }
        });

        contexto = this;

        Button botonIrThirdActivity = (Button) findViewById(R.id.buttonThirdScreen);
        botonIrThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contexto, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
