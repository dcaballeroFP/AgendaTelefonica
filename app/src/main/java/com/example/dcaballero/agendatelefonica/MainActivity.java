package com.example.dcaballero.agendatelefonica;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import me.toptas.fancyshowcase.FancyShowCaseQueue;
import me.toptas.fancyshowcase.FancyShowCaseView;

public class MainActivity extends AppCompatActivity {
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Agregar.class);
        startActivity(i);
    }

    public void onListar(View v){
        Intent i = new Intent(this, BuscarPersona.class);
        startActivity(i);
    }

    public void onEliminar(View v){
        Intent i = new Intent(this, eliminar.class);
        startActivity(i);
    }

    public void premodificar(View v){
        Intent i = new Intent(this, pre_modificar.class);
        startActivity(i);
    }

    public void ejecutar_ayuda(View v){
        Intent i = new Intent(this, Ayuda.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void lanzaShowCaseView(View view){

        View nombreApp = findViewById(R.id.nombre_aplicacion);
        View botonShowCase = findViewById(R.id.button_ayuda_rapida);
        View botonAgregar = findViewById(R.id.agregarbtn);
        View botonListar = findViewById(R.id.listarbtn);
        View botonModificar = findViewById(R.id.modificar_btn);
        View botonEliminar = findViewById(R.id.eliminar_btn);
        View botonAyuda = findViewById(R.id.ayuda);


        Animation animation = new AlphaAnimation(0.0f,1.0f);
        animation.setDuration(250);

        final FancyShowCaseView fancyShowCaseWelcome = new FancyShowCaseView.Builder(this)
                .title("Este es el nombre de la aplicacion.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER)
                .backgroundColor(R.color.showCaseBackground)
                .focusOn(nombreApp)
                .build();

        final FancyShowCaseView fancyShowCaseView = new FancyShowCaseView.Builder(this)
                .title("Este es el boton para mostrar la ayuda rapìda.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER | Gravity.BOTTOM)
                .backgroundColor(R.color.showCaseBackground)
                .focusBorderColor(Color.BLUE)
                .focusBorderSize(5)
                .focusOn(botonShowCase)
                .build();

        final FancyShowCaseView fancyShowCaseViewAgregar = new FancyShowCaseView.Builder(this)
                .title("Este es el boton para agregar contacto.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER | Gravity.BOTTOM)
                .backgroundColor(R.color.showCaseBackground)
                .focusCircleRadiusFactor(1.5)
                .focusOn(botonAgregar)
                .build();

        final FancyShowCaseView fancyShowCaseViewListar = new FancyShowCaseView.Builder(this)
                .title("Este es el boton para listar contactos.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER | Gravity.TOP)
                .backgroundColor(R.color.showCaseBackground)
                .focusOn(botonListar)
                .build();

        final FancyShowCaseView fancyShowCaseViewModificar = new FancyShowCaseView.Builder(this)
                .title("Este es el boton para modificar contacto.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER)
                .backgroundColor(R.color.showCaseBackground)
                .focusOn(botonModificar)
                .build();
        final FancyShowCaseView fancyShowCaseViewEliminar = new FancyShowCaseView.Builder(this)
                .title("Este es el boton para eliminar contacto.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER)
                .backgroundColor(R.color.showCaseBackground)
                .focusOn(botonEliminar)
                .build();
        final FancyShowCaseView fancyShowCaseViewAyuda = new FancyShowCaseView.Builder(this)
                .title("Y este es el boton para acceder a la ayuda extendida.")
                .titleStyle(R.style.showcaseText,Gravity.CENTER)
                .backgroundColor(R.color.showCaseBackground)
                .focusOn(botonAyuda)
                .build();

        FancyShowCaseQueue mQueue = new FancyShowCaseQueue()
                .add(fancyShowCaseWelcome)
                .add(fancyShowCaseView)
                .add(fancyShowCaseViewAgregar)
                .add(fancyShowCaseViewListar)
                .add(fancyShowCaseViewModificar)
                .add(fancyShowCaseViewEliminar)
                .add(fancyShowCaseViewAyuda);
        mQueue.show();
    }
}