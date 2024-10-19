package br.com.pedro.unidade3.Exercício1.estoque_copy;

public class MainEstoque {
    public static void main(String[] args) {

        ControleEstoque controleEstoque = new ControleEstoque();
        int qunatOperacoes = 7951387;

        for (int i = 1; i <= qunatOperacoes; i++) {
            String codigo = "PROD-" + (i % 1000);
            String nome = "Produto " + (i % 100);
            Produto oProduto = new Produto(codigo, nome);
            System.out.println("Adicionando produto " + oProduto);
            new Thread(new AdicionarProdutoThread(controleEstoque, oProduto)).start();
        }
        for (int i = 1; i <= qunatOperacoes; i++) {
            String codigo = "PROD-" + (i % 1000);
            System.out.println("REmovendo produto: " + codigo);
            new Thread(new RemoverProdutoThread(controleEstoque, codigo)).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguradar as threads: " + e.getMessage());

        }
    }
}
