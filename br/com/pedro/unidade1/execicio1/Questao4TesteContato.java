/**
 * Classe Questao4TesteContato
 * 
 * Teste da classe Questao4Contato com a construção de 3 
 * instancias.
 * 
 * @author pedroBezerra
 * @version 2.0
 * @since 2024-08-22
 * @codigo-secreto 342492419
*/
package br.com.pedro.unidade1.execicio1;

public class Questao4TesteContato {

    public static void main(String[] args) {
        Questao4Contato contato1 = new Questao4Contato("Caravaggio", "(84) 99999-8888");
        Questao4Contato contato2 = new Questao4Contato("Leonardo da Vinci", "(84) 77777-5555");
        Questao4Contato contato3 = new Questao4Contato("Donatello", "(84) 44157-3157");

        contato1.getNome();
        contato1.getTelefone();
        contato2.getNome();
        contato2.getTelefone();
        contato3.getNome();
        contato3.getTelefone();

        System.out.println(contato1);
        System.out.println(contato2);
        System.out.println(contato3);
        }
}
