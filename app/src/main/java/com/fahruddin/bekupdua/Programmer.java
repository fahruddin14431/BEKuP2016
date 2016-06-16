package com.fahruddin.bekupdua;

/**
 * Created by Fahruddin on 6/16/2016.
 */
public class Programmer extends Manusia implements Mahasiswa{

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
//        super.makan();
        System.out.println("proses makan on overirde");
    }

    public void ngetik(){
        super.makan();
        this.makan();
//        System.out.println("ketik proses");
    }


    @Override
    public void krs() {

    }

    @Override
    public void bimbingan() {

    }
}
