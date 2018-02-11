package com.example.carlosasprilla.mitienda;

import java.util.ArrayList;

public class Tienda {
    private String ID_tienda;
    private String nombre_tienda;

    private ArrayList<Articulo> Items = new ArrayList<>();

    public String getID_tienda() {
        return ID_tienda;
    }

    public void setID_tienda(String ID_tienda) {
        this.ID_tienda = ID_tienda;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    public ArrayList<Articulo> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Articulo> items) {
        Items = items;
    }
}
