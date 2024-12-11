package br.com.robson.estruturaDeDados.vetor.teste;

import br.com.robson.estruturaDeDados.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("B"); //0
        vetor.adiciona("C"); //1
        vetor.adiciona("E"); //2
        vetor.adiciona("F"); //3
        vetor.adiciona("G"); //4

        System.out.println(vetor);

        vetor.adiciona( 0, "A");

        System.out.println(vetor);

        vetor.adiciona( 3, "D");

        System.out.println(vetor);

        vetor.adiciona( 7, "H");

        System.out.println(vetor);

        vetor.adiciona( 8, "I");

        System.out.println(vetor);

        vetor.adiciona( 9, "J");

        System.out.println(vetor);
        System.out.println(vetor.tamanho());

    }
}
