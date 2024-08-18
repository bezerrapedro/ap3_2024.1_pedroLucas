/**
Exercicio 1/questao 4 = Teste da classe Contato  
@author pedroBezerra
@version 1.0
@since 2024-08-18
@codigo-secreto 342492419
*/
package br.com.pedro.unidade1.execicio1;

public class Questao4TesteContato {

    public static void main(String[] args) {
        Questao4Contato contato1 = new Questao4Contato("Pedro Lucas", "(84) 99999-8888");
        Questao4Contato contato2 = new Questao4Contato("Cleiton Rasta", "(84) 77777-5555");
        Questao4Contato contato3 = new Questao4Contato("Nego Drama", "(84) 44157-3157");

        System.out.println("Contato numero 1 = Nome: " + contato1.getNome() + ", Numero: " + contato1.getTelefone());
        System.out.println("Contato numero 1 = Nome: " + contato2.getNome() + ", Numero: " + contato2.getTelefone());
        System.out.println("Contato numero 1 = Nome: " + contato3.getNome() + ", Numero: " + contato3.getTelefone());
    }
}
