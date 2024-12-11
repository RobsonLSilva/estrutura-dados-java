package br.com.robson.estruturaDeDados.vetor.teste;

import br.com.robson.estruturaDeDados.vetor.VetorObject;

public class Aula10 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);

        Contato c1 = new Contato("Contato1", "1234-6547", "contato1@email.com");
        Contato c2 = new Contato("Contato2", "1234-6559", "contato2@email.com");
        Contato c3 = new Contato("Contato3", "1234-5657", "contato3@email.com");

        Contato c4 = new Contato("Contato4", "1234-8557", "contato4@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho do vetor: " + vetor.tamanho());

        int pos = vetor.busca(c4);

        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);

    }
}
