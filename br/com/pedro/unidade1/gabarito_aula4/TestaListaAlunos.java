package br.com.pedro.unidade1.gabarito_aula4;

import java.util.LinkedList;

public class TestaListaAlunos {

    public static void main(String[] args) {
        LinkedList<Aluno> osAlunos = new LinkedList<Aluno>();

        System.out.println("Imprimindo a lista de Alunos: ");
        
        for (int i = 0; i < 8; i++) {
            Aluno umAluno = new Aluno();

            umAluno.setNome("Aluno Nº" + i);
            osAlunos.add(umAluno);
            System.out.println(umAluno);
        }


    }
}
