package br.com.robson.estruturaDeDados.vetor;

public class VetorObject {

    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento){

        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    public void adiciona(int posicao, Object elemento){
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
            Object[] aux = new Object[this.elementos.length * 2];
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

    public Object busca(int posicao){
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento){
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho(){
        return this.tamanho;
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
