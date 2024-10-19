package br.com.pedro.unidade3.Exercício1.estoque_copy;

public class ProdutoNaoEncontradoException extends Exception{
    public ProdutoNaoEncontradoException(String codigoProduto){
        super("Ops, o produto "+ codigoProduto +" não encontrado");
    }
}
