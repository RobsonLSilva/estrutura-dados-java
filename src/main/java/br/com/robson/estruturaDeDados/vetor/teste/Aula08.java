package br.com.robson.estruturaDeDados.vetor.teste;

import br.com.robson.estruturaDeDados.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

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

        vetor.adiciona( 10, "K");

        System.out.println(vetor);

        vetor.adiciona( 11, "L");

        System.out.println(vetor);

        vetor.adiciona( 12, "M");

        System.out.println(vetor);

        vetor.adiciona( 13, "N");

        System.out.println(vetor);

        vetor.adiciona( 14, "O");

        System.out.println(vetor);

        vetor.adiciona( 15, "P");

        System.out.println(vetor);

        vetor.adiciona( 16, "Q");

        System.out.println(vetor);

        vetor.adiciona( 17, "R");

        System.out.println(vetor);

        vetor.adiciona( 18, "S");

        System.out.println(vetor);

        vetor.adiciona( 19, "T");

        System.out.println(vetor);

        vetor.adiciona( 20, "U");

        System.out.println(vetor);

        vetor.adiciona( 21, "V");

        System.out.println(vetor);

        vetor.adiciona( 22, "W");

        System.out.println(vetor);

        vetor.adiciona( 23, "X");

        System.out.println(vetor);

        vetor.adiciona( 24, "Y");

        System.out.println(vetor);

        vetor.adiciona( 25, "Z");

        System.out.println(vetor);
        System.out.println(vetor.tamanho());

    }
}
