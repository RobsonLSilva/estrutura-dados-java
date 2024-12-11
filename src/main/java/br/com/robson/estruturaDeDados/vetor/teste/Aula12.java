package br.com.robson.estruturaDeDados.vetor.teste;

import br.com.robson.estruturaDeDados.vetor.Lista;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayLista = new ArrayList<>();

        arrayLista.add("A");
        arrayLista.add("C");

        System.out.println(arrayLista);

        arrayLista.add(1,"B");

        System.out.println(arrayLista);

        boolean exite = arrayLista.contains("A");

        if (exite) {
            System.out.println("Elemento existe no Array");
        } else {
            System.out.println("Elemento não existe no Array");
        }

        int pos = arrayLista.indexOf("B");
        if (pos > -1) {
            System.out.println("Elemento existe no Array " + pos);
        } else {
            System.out.println("Elemento não existe no Array " + pos);
        }

        System.out.println(arrayLista.get(2));

        arrayLista.removeFirst();
        arrayLista.remove("B");

        System.out.println(arrayLista);

        System.out.println(arrayLista.size());

        int teste = arrayLista.lastIndexOf("B");

        System.out.println(teste);

    }
}
