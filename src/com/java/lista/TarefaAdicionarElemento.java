package com.java.lista;

public class TarefaAdicionarElemento implements Runnable {
    private final int numero;
    private Lista lista;
    public TarefaAdicionarElemento(Lista lista, int numero) {
        this.numero = numero;
        this.lista = lista;
    }

    @Override
    public void run() {
        for(int i = 0; i<10;i++){
            lista.adicionaElementos("Thread " + numero + " - " + i);
        }
    }
}
