package com.java.lista;

public class TarefaImprimir implements Runnable {
    private final Lista lista;

    public TarefaImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {

        synchronized (lista) {

            if (!lista.estacheia()) {
                try {
                    System.out.println("Esperando preencher a lista, indo dormir");
                    lista.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Imprimindo");
            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println(i + " - " + lista.pegaElemento(i));
            }
        }


    }
}
