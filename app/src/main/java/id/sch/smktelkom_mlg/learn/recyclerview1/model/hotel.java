package id.sch.smktelkom_mlg.learn.recyclerview1.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Affandhy on 06/11/2016.
 */

public class hotel {

    public String Judul;
    public String Deskripsi;
    public Drawable foto;

    public hotel(String Judul, String Deskripsi, Drawable foto) {
        this.Judul = Judul;
        this.Deskripsi = Deskripsi;
        this.foto = foto;
    }
}