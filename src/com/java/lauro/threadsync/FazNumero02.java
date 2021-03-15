package com.java.lauro.threadsync;

public class FazNumero02 implements Runnable {

    private Banheiro banheiro;

    public FazNumero02(Banheiro banheiro){
        this.banheiro = banheiro;
    }
    @Override
    public void run() {
        banheiro.fazNumero2();
    }
}
