package com.java.banheiro.threadsync;

public class FazNumero01 implements Runnable {

    private Banheiro banheiro;

    public FazNumero01(Banheiro banheiro){
        this.banheiro = banheiro;
    }
    @Override
    public void run() {
        banheiro.fazNumero1();
    }
}
