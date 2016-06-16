package com.fahruddin.bekupdua;

/**
 * Created by Fahruddin on 6/16/2016.
 */
public class Main {
    public static void main(String[] args) {
//        Manusia m = new Manusia();
//        m.makan();
//
//        Programmer programmer = new Programmer("fahruddin");
//        programmer.makan();
//        programmer.ngetik();


        PC_Gaming dell = new PC_Gaming();
        dell.hidupkan();
        dell.aksi_main("DOTA");

        PC_Desain apple = new PC_Desain();
        apple.hidupkan();
        apple.aksi_gambar("melukis");




    }
}
