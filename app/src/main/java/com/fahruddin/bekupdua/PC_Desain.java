package com.fahruddin.bekupdua;

/**
 * Created by Fahruddin on 6/16/2016.
 */
public class PC_Desain extends Komputer {
    @Override
    public void hidupkan() {
//        super.hidupkan();
        System.out.println("PC Desain dihidupkan");
    }

    public void aksi_gambar(String judul){
        System.out.println("Judul = "+judul);
    }

    public void aksi_gambar(String judul, String deskripsi){
        System.out.println("Judul = "+judul+" Deskripsi = "+deskripsi);
    }

}
