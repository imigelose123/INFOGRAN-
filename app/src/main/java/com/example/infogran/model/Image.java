package com.example.infogran.model;

public class Image {
    private String urlImagen;
    private String username;
    private String catindadDias;
    private String cantidadMeGusta;

    public Image(String urlImagen, String username, String catindadDias, String cantidadMeGusta) {
        this.setUrlImagen(urlImagen);
        this.setUsername(username);
        this.setCatindadDias(catindadDias);
        this.setCantidadMeGusta(cantidadMeGusta);
    }


    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCatindadDias() {
        return catindadDias;
    }

    public void setCatindadDias(String catindadDias) {
        this.catindadDias = catindadDias;
    }

    public String getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void setCantidadMeGusta(String cantidadMeGusta) {
        this.cantidadMeGusta = cantidadMeGusta;
    }
}
