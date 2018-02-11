package com.example.carlosasprilla.mitienda;

import android.media.Image;

/**
 * Created by Carlos Asprilla on 11/02/2018.
 */

public class Articulo {
    String nombre_articulo;
    String ID_articulo;
    Image Imagen;

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public String getID_articulo() {
        return ID_articulo;
    }

    public void setID_articulo(String ID_articulo) {
        this.ID_articulo = ID_articulo;
    }

    public Image getImagen() {
        return Imagen;
    }

    public void setImagen(Image imagen) {
        Imagen = imagen;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    Double Precio;

}
