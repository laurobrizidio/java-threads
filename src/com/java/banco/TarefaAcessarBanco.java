package com.java.banco;

public class TarefaAcessarBanco implements Runnable {

    private final PoolDeConexao pool;
    private final GerenciadorDeTransacao tx;

    public TarefaAcessarBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (pool){

            System.out.println("Chave do pool");
            pool.getConnection();


            synchronized (tx){
                System.out.println("Comecando Gerenciar a tx");
                tx.begin();

            }
        }
    }
}
