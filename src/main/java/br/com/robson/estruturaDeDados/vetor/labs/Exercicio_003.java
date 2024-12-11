package br.com.robson.estruturaDeDados.vetor.labs;

import br.com.robson.estruturaDeDados.vetor.Lista;

public class Exercicio_003 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>();

        lista.adiciona(0, "A");
        lista.adiciona("B");
        lista.adiciona(2, "C");
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona("E");
        lista.adiciona("E");
        lista.adiciona("F");
        lista.adiciona("F");




        System.out.println(lista);

        boolean contem = lista.contem("A");
        if (contem) {
            System.out.println("O elemento está presente na lista");
        } else {
            System.out.println("O elemento não está presente na lista");
        }

        int ultimo = lista.ultimoIndice("E");

        System.out.println(ultimo);

        lista.remove("F");
        lista.remove("E");

        System.out.println(lista);

    }
}
