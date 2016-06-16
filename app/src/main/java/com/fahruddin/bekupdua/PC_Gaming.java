package com.fahruddin.bekupdua;

/**
 * Created by Fahruddin on 6/16/2016.
 */
public class PC_Gaming extends Komputer implements Server {
    @Override
    public void hidupkan() {
//        super.hidupkan();
        System.out.println("PC gaming dihidupkan");
    }

    public void aksi_main(String judul){
        System.out.println("Judul = "+judul);
    }

    public void aksi_main(String judul, String deskripsi){
        System.out.println("Judul = "+judul+" Deskripsi = "+deskripsi);
    }

    @Override
    public void download() {

    }

    @Override
    public void upload() {

    }
}
