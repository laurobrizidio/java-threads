package com.java.banheiro.threadsync;

public class Banheiro {

    private boolean isSujo = true;

    public synchronized void fazNumero1() {
        String convidado = Thread.currentThread().getName();


        System.out.print(convidado + " Entra no Banheiro\n");

        while(isSujo){
            esperarFora(convidado);
        }
        System.out.print(convidado + " Faz Numero 01\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(convidado + " Lava a mao\n");
        System.out.print(convidado + " Sair do Banheiro\n");
        this.isSujo=true;
    }

    private void esperarFora(String convidado) {
        System.out.println(convidado + " Banheiro Sujo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void fazNumero2() {
        String convidado = Thread.currentThread().getName();
        System.out.print(convidado + " Entra no Banheiro\n");

        while(isSujo){
            esperarFora(convidado);
        }
        System.out.print(convidado + " Faz Numero 02\n");


        dorme(2000);
        System.out.print(convidado + " Lava a mao\n");
        System.out.print(convidado + " Sair do Banheiro\n");
        this.isSujo=true;
    }

    private void dorme(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void limpa(){

        String convidado = Thread.currentThread().getName();

        System.out.print(convidado + " Entra no Banheiro\n");

        synchronized (this){
            if(!isSujo){
                System.out.print(convidado + "Não esta sujo\n");
                return;
            }

            System.out.print(convidado + "Limpando o Banheiro\n");
            this.isSujo = false;

           dorme(3000);
            System.out.print(convidado + "Limpeza Saindo do Banheiro\n");
            this.notifyAll();



        }

    }

}
