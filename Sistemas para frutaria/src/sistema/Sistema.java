/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import produto.Produto;
import java.util.HashMap;
import java.util.Arrays;

/**
 *
 * @author julio
 */
public class Sistema {

    private static final HashMap<String, Produto> lista = new HashMap<>();

    public static String[] getNomes() {

        if (lista.isEmpty()) return null;

        int i = 0;
        String[] nomes = new String[lista.size()];

        for (String chave: lista.keySet()) {
            nomes[i] = lista.get(chave).getNome();
            i++;
        }

        Arrays.sort(nomes);

        return nomes;

    }

    public static Produto getProduto(String nome) throws ChaveInvalidaException {

        if (!lista.containsKey(nome)) throw new ChaveInvalidaException();

        return lista.get(nome);

    }

    public static Produto[] getProdutos() {

        if (lista.isEmpty()) return null;

        int i = 0;
        String[] nome = Sistema.getNomes();
        Produto[] produto = new Produto[lista.size()];

        for (String chave: nome) {
            produto[i] = lista.get(chave);
            i++;
        }

        return produto;

    }

    public static void adicionarProduto(String nome, int quantidade, double preco) throws ChaveInvalidaException {

        if (lista.containsKey(nome) || nome.equals("Selecione o produto")) throw new ChaveInvalidaException();

        lista.put(nome, new Produto(nome, quantidade, preco));

    }

    public static void alterarProduto(String nome, int quantidade, double preco) throws ChaveInvalidaException {

        if (!lista.containsKey(nome)) throw new ChaveInvalidaException();

        lista.put(nome, new Produto(nome, quantidade, preco));

    }

    public static void removerProduto(String nome) throws ChaveInvalidaException {

        if (!lista.containsKey(nome)) throw new ChaveInvalidaException();

        lista.remove(nome);

    }

}
