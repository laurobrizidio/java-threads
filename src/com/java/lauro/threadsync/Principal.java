package com.java.lauro.threadsync;

public class Principal {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();

        Thread convidado01 = new Thread(new FazNumero01(banheiro),"Joao");
        Thread convidado02 = new Thread(new FazNumero02(banheiro),"Pedro");
        convidado01.start();
        convidado02.start();
    }
}
