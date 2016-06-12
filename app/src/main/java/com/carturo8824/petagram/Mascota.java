package com.carturo8824.petagram;

import android.widget.ImageButton;

/**
 * Created by Borregos123 on 11/06/2016.
 */
public class Mascota {
    private String nombre;
    private int foto;
    private String rating;


    public Mascota(String nombre,int foto,String rating) {
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
