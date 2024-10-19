package br.com.pedro.unidade3.Exercício1.estoque_copy;

import java.util.Arrays;

public class ControleEstoque {
    private int capacidade = 200;
    private Produto[] osProdutos = new Produto[capacidade];
    private int contador = 0;

   

    public synchronized void adicionar(Produto produto) {
        if (contador < capacidade) {
            osProdutos[contador] = produto;
            contador++;
            System.out.println("Produto adicionado " + produto.getCodigo());
        } else {
            System.out.println("A capacidade maxima foi atingida. Não é possivel adicionar novos produtos");
        }
    }

    public synchronized void remover(String codigoProduto) throws ProdutoNaoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (osProdutos[i].getCodigo().equals(codigoProduto)) {
                osProdutos[i] = osProdutos[contador - 1];
                osProdutos[contador - 1] = null;
                contador--;
                System.out.println("Produto Removido: " + codigoProduto);
                return;
            }
        }
        throw new ProdutoNaoEncontradoException(codigoProduto);
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Produto[] getOsProdutos() {
        return osProdutos;
    }

    public void setOsProdutos(Produto[] osProdutos) {
        this.osProdutos = osProdutos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "ControleEstoque [capacidade=" + capacidade + ", osProdutos=" + Arrays.toString(osProdutos)
                + ", contador=" + contador + "]";
    }

}
