package br.com.robson.estruturaDeDados.vetor.labs;

import br.com.robson.estruturaDeDados.vetor.Lista;

import java.util.ArrayList;

public class Exercicio_001 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>();

        lista.adiciona("B");
        lista.adiciona("D");

        lista.adiciona(0, "A");
        lista.adiciona(2, "C");

        System.out.println(lista);

        boolean contem = lista.contem("A");
        if (contem) {
            System.out.println("O elemento está presente na lista");
        } else {
            System.out.println("O elemento não está presente na lista");
        }



    }
}
