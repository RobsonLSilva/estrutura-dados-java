package br.com.robson.estruturaDeDados.vetor.labs;

import br.com.robson.estruturaDeDados.vetor.Lista;

import java.util.ArrayList;

public class Exercicio_004 {
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


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add("H");

        String teste = arrayList.get(3);
        String testeLista = lista.obtem(0);

        System.out.println(teste);
        System.out.println(testeLista);

    }
}
