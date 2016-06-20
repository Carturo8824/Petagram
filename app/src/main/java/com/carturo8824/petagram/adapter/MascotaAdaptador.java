package com.carturo8824.petagram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.carturo8824.petagram.pojo.Mascota;
import com.carturo8824.petagram.R;

import java.util.ArrayList;

/**
 * Created by Borregos123 on 11/06/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>  {

    ArrayList<Mascota> mascotas;
    Activity activity;


    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaviewholder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaviewholder.imgvFoto.setImageResource(mascota.getFoto());
        mascotaviewholder.tvNombreCV.setText(mascota.getNombre());
        mascotaviewholder.tvRatingCV.setText(String.valueOf(mascota.getRating()));

        mascotaviewholder.imgbLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mascota.setRating(mascota.getRating()+1);
                actualizarRating(mascotaviewholder,mascota);
                Toast.makeText(activity,"Diste like a " + mascota.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgvFoto;
        private TextView tvNombreCV;
        private TextView tvRatingCV;
        private ImageButton imgbLike;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgvFoto = (ImageView) itemView.findViewById(R.id.imgvFoto);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvRatingCV =(TextView) itemView.findViewById(R.id.tvRatingCV);
            imgbLike =(ImageButton) itemView.findViewById(R.id.imgbLike);

        }
    }
    public void actualizarRating(MascotaViewHolder mascotaviewholder, Mascota mascota){
        mascotaviewholder.tvRatingCV.setText(Integer.toString(mascota.getRating()));
    }
}
