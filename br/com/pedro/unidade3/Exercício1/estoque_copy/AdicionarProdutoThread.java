package br.com.pedro.unidade3.Exercício1.estoque_copy;

public class AdicionarProdutoThread extends Thread {
    private final ControleEstoque controleEstoque;
    private final Produto produto;

    public AdicionarProdutoThread(ControleEstoque controleEstoque, Produto produto) {
        this.controleEstoque = controleEstoque;
        this.produto = produto;
    }
    @Override
    public void run() {
        controleEstoque.adicionar(produto);
    }
}
