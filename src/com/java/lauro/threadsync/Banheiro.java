package com.java.lauro.threadsync;

public class Banheiro {
    public synchronized void fazNumero1() {
        String convidado = Thread.currentThread().getName();


        System.out.print(convidado + " Entra no Banheiro\n");
        System.out.print(convidado + " Faz Numero 01\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(convidado + " Lava a mao\n");
        System.out.print(convidado + " Sair do Banheiro\n");
    }

    public synchronized void fazNumero2() {
        String convidado = Thread.currentThread().getName();
        System.out.print(convidado + " Entra no Banheiro\n");
        System.out.print(convidado + " Faz Numero 02\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(convidado + " Lava a mao\n");
        System.out.print(convidado + " Sair do Banheiro\n");
    }

}
