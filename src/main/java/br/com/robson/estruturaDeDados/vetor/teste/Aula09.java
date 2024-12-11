package br.com.robson.estruturaDeDados.vetor.teste;

import br.com.robson.estruturaDeDados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); //0
        vetor.adiciona("G"); //1
        vetor.adiciona("D"); //2
        vetor.adiciona("E"); //3
        vetor.adiciona("F"); //4

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        // removendo pelo elemento
        vetor.remove(vetor.busca("E"));

        System.out.println(vetor);
        System.out.println(vetor.tamanho());

    }
}
