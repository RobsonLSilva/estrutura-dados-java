package br.com.robson.estruturaDeDados.vetor;

public class RecapVetor {
    public static void main(String[] args) {

        double[] temperaturas = new double[365]; // Definindo o tamanho do Array
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 3 é " + temperaturas[2]);

        System.out.println("O tamanho do Array: " + temperaturas.length); // o método length retorna o tamanho do Array

        // Utilizando o for normal para iterar os elementos do Array
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }
        System.out.println("---------------------------");

        // Utilizar o for melhorado (for each) para Iterar os elementos do Array
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
