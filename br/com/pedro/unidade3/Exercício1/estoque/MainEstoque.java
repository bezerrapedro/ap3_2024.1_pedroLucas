package br.com.pedro.unidade3.Exercício1.estoque;

public class MainEstoque {
    public static void main(String[] args) {

        ControleEstoque controleEstoque = new ControleEstoque(30, null, 0);

        Produto produto1 =  new Produto("1", "açucar", 15);
        Produto produto2 =  new Produto("2", "café", 10);
        Produto produto3 =  new Produto("3", "arroz", 20);

        try{
            System.out.println("Adicionar Produto");
            controleEstoque.adicionar(produto1);
            controleEstoque.adicionar(produto2);
            controleEstoque.adicionar(produto3);

            System.out.println("Remover Produto");
            controleEstoque.remover("4");
            System.out.println("1 produto removido.");
        }catch(ProdutoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }
}
