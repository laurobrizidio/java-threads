package com.java.lista;


public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Lista lista = new Lista();

        System.out.println("Adcionando Elementos");

        for (int i = 0; i < 10;i++){
            new Thread(new TarefaAdicionarElemento(lista,i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();


    }
}
