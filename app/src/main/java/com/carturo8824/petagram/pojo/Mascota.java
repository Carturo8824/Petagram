package com.carturo8824.petagram.pojo;

import android.widget.ImageButton;

/**
 * Created by Borregos123 on 11/06/2016.
 */
public class Mascota {
    private String nombre;
    private int foto;
    private int rating;


    public Mascota(String nombre,int foto,int rating) {
        this.nombre = nombre;
        this.foto=foto;
        this.rating=rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
