package com.fahruddin.bekupdua;

/**
 * Created by Fahruddin on 6/16/2016.
 */
public class Manusia {
    private String nama = "";
    private int umur = 0;

    public Manusia(String nama) {
        this.nama = nama;
    }

//    public Manusia(int umur) {
//        this.umur = umur;
//    }
//
//    public Manusia(String nama, int umur) {
//        this.nama = nama;
//        this.umur = umur;
//    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void makan(){
        System.out.println("proses makan");
    }

}
