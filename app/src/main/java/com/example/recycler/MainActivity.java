package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRv;
    private int LISTA_NUMEROS_CANCIONES = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*PRIMERO Le damos el estilo al Recgcler */
        //recupero el Recycler
        myRv = findViewById(R.id.rvCanciones);
        //linea que divide cada elemento
        myRv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        // mgRv.setItemAnimator();

        //creamos nuevo layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //setearselo al recgcler
        myRv.setLayoutManager(linearLayoutManager);

        /*SEGUNDO Cargamos eI contenido con nuestro propio adaptador */
        //Adaptador, que será el que le pase toda ta información al recgcler
        RecyclerAdapter myAdapter = new RecyclerAdapter(LISTA_NUMEROS_CANCIONES);
        myRv.setAdapter(myAdapter) ;
    }
}