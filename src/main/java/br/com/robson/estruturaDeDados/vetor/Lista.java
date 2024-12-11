package br.com.robson.estruturaDeDados.vetor;
// Trabalhando com Generics

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    private static final int CAPACIDATE_DEFAULT = 10;

    public Lista(int capacidade) {
        //noinspection unchecked
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(){
        //noinspection unchecked
        this.elementos = (T[]) new Object[CAPACIDATE_DEFAULT];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        //noinspection unchecked
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public void adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    public void adiciona(int posicao, T elemento){
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        // Mover todos os elementos
        for(int i = tamanho - 1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length) {
            //noinspection unchecked
            T[] aux = (T[])new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                aux[i] = this.elementos[i];
            }
            this.elementos = aux;
        }
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao; i <= tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;
    }

    public void remove(T elemento){
        int pos = busca(elemento);
        if(pos >= 0){
            remove(pos);
        }
    }

    public T obtem(int posicao){
        return this.busca(posicao);
    }

    public T busca(int posicao){
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }



    public boolean contem(T elemento){
        return busca(elemento) >= 0;
    }

    public int ultimoIndice(T elemento){
        for (int i = tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public void limpar(){
        for (int i = tamanho-1; i >= 0 ; i--) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for(int i = 0; i < this.tamanho - 1; i++){
            sb.append(this.elementos[i]);
            sb.append(", ");
        }

        if (this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho-1]);
        }

        sb.append("]");

        return sb.toString();
    }
}
