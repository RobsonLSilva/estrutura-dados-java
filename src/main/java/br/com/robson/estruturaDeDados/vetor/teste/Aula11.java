package br.com.robson.estruturaDeDados.vetor.teste;

import br.com.robson.estruturaDeDados.vetor.Lista;
import br.com.robson.estruturaDeDados.vetor.VetorObject;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(2);


        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");

        System.out.println("Tamanho do vetor: " + vetor.tamanho());

        System.out.println(vetor);

    }
}
