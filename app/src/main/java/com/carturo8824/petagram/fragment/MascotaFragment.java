package com.carturo8824.petagram.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carturo8824.petagram.R;
import com.carturo8824.petagram.adapter.MascotaAdaptador;
import com.carturo8824.petagram.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Borregos123 on 19/06/2016.
 */
public class MascotaFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     //   return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_mascota,container,false);

        listaMascotas =(RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm =new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdapatador();

        return v;
    }
    public void inicializarAdapatador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Pinguino",R.drawable.ping,5));
        mascotas.add(new Mascota("Gato",R.drawable.cat_head_1821212,5));
        mascotas.add(new Mascota("Perro",R.drawable.clifford_the_big_red_dog,4));
        mascotas.add(new Mascota("Hipopotamo",R.drawable.cute_baby_hippopotamus_vector_566547,3));

    }
}

