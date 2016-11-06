package id.sch.smktelkom_mlg.learn.recyclerview2.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Affandhy on 06/11/2016.
 */

public class Hotel {

    public String Judul;
    public String Deskripsi;
    public Drawable foto;

    public Hotel(String Judul, String Deskripsi, Drawable foto) {
        this.Judul = Judul;
        this.Deskripsi = Deskripsi;
        this.foto = foto;
    }
}