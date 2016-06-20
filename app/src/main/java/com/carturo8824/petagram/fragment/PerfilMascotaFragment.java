package com.carturo8824.petagram.fragment;


import android.os.Bundle;
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
 * A simple {@link Fragment} subclass.
 */
public class PerfilMascotaFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    public PerfilMascotaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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
        mascotas.add(new Mascota("Pinguino",R.drawable.ping,2));
        mascotas.add(new Mascota("Pinguino",R.drawable.ping,4));
        mascotas.add(new Mascota("Pinguino",R.drawable.ping,6));
        mascotas.add(new Mascota("Pinguino",R.drawable.ping,7));
        mascotas.add(new Mascota("Pinguino",R.drawable.ping,8));
        mascotas.add(new Mascota("Pinguino",R.drawable.ping,9));

    }

}
