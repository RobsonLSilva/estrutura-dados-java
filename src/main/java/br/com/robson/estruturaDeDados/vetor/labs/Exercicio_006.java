package br.com.robson.estruturaDeDados.vetor.labs;

import br.com.robson.estruturaDeDados.vetor.Lista;
import br.com.robson.estruturaDeDados.vetor.teste.Contato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio_006 {
    public static void main(String[] args) throws IOException {

        // Criação das variáveis
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

        // Criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        // criar um menu para que o usuário escolha a opção
        int opcao = 1;

        while(opcao != 0){
            opcao = obterOpcaoMenu(reader);

            switch (opcao){
                case 1:
                    adicionaContatoFinal(reader, lista);
                    break;
                case 2:
                    adicionaContatoPosicao(reader, lista);
                    break;
                case 3:
                    obtemContatoPosicao(reader, lista);
                    break;
                case 4:
                    obtemContato(reader, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(reader, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(reader, lista);
                    break;
                case 7:
                    excluirPorPosicao(reader, lista);
                    break;
                case 8:
                    excluirContato(reader, lista);
                    break;
                case 9:
                    imprimiTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }

        System.out.println("Usuário digitou 0, programa finalizado.");
        reader.close();
    }

    private static void imprimiTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
        System.out.println();
    }

    private static void limparVetor(Lista<Contato> lista){
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos");
        System.out.println();
    }

    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
        System.out.println();
    }

    private static void obtemContatoPosicao(BufferedReader reader, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", reader);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);

            System.out.println();
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(BufferedReader reader, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", reader);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);
            System.out.println();
            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);
            System.out.println();
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(BufferedReader reader, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", reader);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);
            System.out.println();
            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);
            System.out.println();
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(BufferedReader reader, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", reader);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);
            if (existe) {
                System.out.println("Contato existe, segue dados:");
                System.out.println(contato);
                System.out.println();
            } else {
                System.out.println("Contato não existe");
            }
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(BufferedReader reader, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", reader);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluído");
            System.out.println();
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(BufferedReader reader, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", reader);

        try {
            lista.remove(pos);
            System.out.println("Contato excluído");
            System.out.println();
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionaContatoFinal(BufferedReader reader, Lista<Contato> lista) throws IOException {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", reader);
        String telefone = leInformacao("Entre com o telefone", reader);
        String email = leInformacao("Entre com o e-mail", reader);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
        System.out.println();
    }

    private static void adicionaContatoPosicao(BufferedReader reader, Lista<Contato> lista) throws IOException {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", reader);
        String telefone = leInformacao("Entre com o telefone", reader);
        String email = leInformacao("Entre com o e-mail", reader);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", reader);

        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
            System.out.println();
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static String leInformacao(String msg, BufferedReader reader) throws IOException {
        System.out.println(msg);
        return reader.readLine();
    }

    protected static int leInformacaoInt(String msg, BufferedReader reader) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida){
            try {
                System.out.println(msg);
                num = Integer.parseInt(reader.readLine());
                entradaValida = true;
            } catch (IOException e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }
        return num;
    }

    protected static int obterOpcaoMenu(BufferedReader reader){
        boolean entradaValida = false;
        String entrada;
        int opcao = 0;

        while(!entradaValida){
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição especifica");
            System.out.println("3: Obtém contato de uma posição especifica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos contato do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try {
                entrada = reader.readLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }

        }
        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){
        Contato contato;
        for (int i = 0; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("(11) 1111-111" + i);
            contato.setEmail("contato" + i + "@email.com");
            lista.adiciona(contato);
        }
    }

}
