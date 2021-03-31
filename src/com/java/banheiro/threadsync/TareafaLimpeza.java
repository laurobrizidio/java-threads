package com.java.banheiro.threadsync;

public class TareafaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TareafaLimpeza(Banheiro banheiro){
        this.banheiro = banheiro;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            banheiro.limpa();
        }
    }
}
