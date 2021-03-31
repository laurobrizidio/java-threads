package com.java.banheiro.thread02;

import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        String nome  = new Scanner(System.in).next();



        Thread thread01 = new Thread(new TaskBuscaTexto("assinaturas1.txt", nome));
        Thread thread02 = new Thread(new TaskBuscaTexto("assinaturas2.txt", nome));
        Thread thread03 = new Thread(new TaskBuscaTexto("autores.txt", nome));

        thread01.start();
        thread02.start();
        thread03.start();
    }
}
