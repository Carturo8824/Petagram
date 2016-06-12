package com.carturo8824.petagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

/**
 * Created by Borregos123 on 12/06/2016.
 */
public class MascotaFavorita extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_favoritas);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarFav);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas =(RecyclerView) findViewById(R.id.rvMascotasFav);

        LinearLayoutManager llm =new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdapatador();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return  true ;

    }

    public void inicializarAdapatador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Gato",R.drawable.cat_head_1821212,"5"));
        mascotas.add(new Mascota("Perro 1",R.drawable.clifford_the_big_red_dog,"4"));
        mascotas.add(new Mascota("Hipopotamo",R.drawable.cute_baby_hippopotamus_vector_566547,"3"));
        mascotas.add(new Mascota("Perro 2",R.drawable.dog,"2"));
        mascotas.add(new Mascota("Hampster",R.drawable.hamster,"1"));
        mascotas.add(new Mascota("Pinguino",R.drawable.ping,"5"));
    }
}
