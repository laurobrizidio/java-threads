package com.java.lauro.thread01;

public class Principal {
    public static void main(String[] args) throws InterruptedException {

        Runnable task = new TarefaMultiplicacao();
        Thread threadCalculo = new Thread(task);
        threadCalculo.start();
        System.out.println("Isso é thread Main!");


    }
}
