package com.example.jsureda.myvideostudium;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class IntroducirPelicula extends AppCompatActivity {

    EditText txtTitulo, txtAnyo;
    RatingBar ratBar;
    Spinner spnGen;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_pelicula);
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
        inicializarUI();
        adapter = ArrayAdapter.createFromResource(this, R.array.spinnerEstado, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnGen.setAdapter(adapter);
    }
    public void inicializarUI(){
        txtTitulo = (EditText) findViewById(R.id.txtTitulo2);
        txtAnyo = (EditText) findViewById(R.id.txtAnyo2);
        spnGen = (Spinner) findViewById(R.id.spnEstado2);
        ratBar = (RatingBar) findViewById(R.id.barraNota);
    }
}
