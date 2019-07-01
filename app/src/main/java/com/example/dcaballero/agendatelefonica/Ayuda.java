package com.example.dcaballero.agendatelefonica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);
    }

    public void ejecutar_ayuda_agregar(View view){

        Intent i = new Intent(this, AyudaAgregar.class);
        startActivity(i);
    }
    public void ejecutar_ayuda_listar(View view){

        Intent i = new Intent(this, AyudaListar.class);
        startActivity(i);
    }
    public void ejecutar_ayuda_modificar(View view){

        Intent i = new Intent(this, AyudaModificar.class);
        startActivity(i);
    }
    public void ejecutar_ayuda_eliminar(View view){

        Intent i = new Intent(this, AyudaEliminar.class);
        startActivity(i);
    }
}
