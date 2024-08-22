/**
 * Classe Questao4Contato
 * 
 * Construção da Classe contato com um nome 
 * e um telefone
 * 
 * @author pedroBezerra
 * @version 2.0
 * @since 2024-08-22
 * @codigo-secreto 342492419
*/
package br.com.pedro.unidade1.execicio1;

public class Questao4Contato {

    public String nome;
    public String telefone;

    public Questao4Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Questao4Contato [nome=" + nome.toUpperCase() + ", telefone=" + telefone + "]"; // Xico - corrigindo:
                                                                                               // falta maiuscula.
    }

}
