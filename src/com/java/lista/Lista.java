package com.java.lista;

public class Lista {

    private String[] elementos = new String[100];
    private int indice = 0;

    public synchronized void adicionaElementos(String elemento){
        elementos[indice] = elemento;
        indice++;

//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        if(this.indice == this.elementos.length){
            System.out.println("Lista cheia, notificando");
            this.notify();
        }

    }


    public int tamanho(){
        return this.elementos.length;

    }

    public String pegaElemento(int posicao){
        return this.elementos[posicao];
    }

    public boolean estacheia() {
        return tamanho() == this.indice;
    }
}
