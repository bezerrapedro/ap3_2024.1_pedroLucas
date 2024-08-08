package unidade1.gabarito_aula4;

import java.util.LinkedList;

public class TestaListaAlunos {
    public static void main(String[] args) {
        LinkedList<Aluno> osAlunos = new LinkedList<Aluno>();
        
        for (int i = 0; i < 89764; i++) {
            Aluno umAluno = new Aluno();

            umAluno.setNome("Aluno Nº" + i);
            osAlunos.add(umAluno);
            System.out.println(umAluno);
        }

        System.out.println("Imprimindo a lista de Alunos; ");
    }
}
