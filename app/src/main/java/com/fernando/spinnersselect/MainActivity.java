package com.fernando.spinnersselect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Array de elementos
        String [] elementos = {"Toledo", "Ciudad Real", "Cuenca", "Guadalajara", "Albacete"};

        // Adaptador de texto (String)
        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Lista de referencia
        Spinner sp= (Spinner) findViewById(R.id.spinnerProvincias);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, elementos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adaptador);
        sp.setOnItemSelectedListener(this);
        //Pasamos adaptador a la lista


    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView t = (TextView) findViewById(R.id.textViewProvincias);
        Spinner sp = (Spinner) findViewById(R.id.spinnerProvincias);

        t.setText(sp.getSelectedItem().toString());

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        TextView t = findViewById(R.id.textViewProvincias);
        t.setText("No se ha seleccionado nada");
    }


}