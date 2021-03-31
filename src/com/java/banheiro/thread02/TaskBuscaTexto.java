package com.java.banheiro.thread02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskBuscaTexto implements Runnable {
    String nomeArquivo;
    String nomeProcurado;

    public TaskBuscaTexto(String nomeArquivo, String nomeProcurado) {
        this.nomeArquivo = nomeArquivo;
        this.nomeProcurado = nomeProcurado;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            int numeroLinha = 1;
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.toLowerCase().contains(nomeProcurado.toLowerCase())) {
                    System.out.print(nomeArquivo + " - " + numeroLinha + " - " + linha + "\n");
                }
                numeroLinha++;
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
