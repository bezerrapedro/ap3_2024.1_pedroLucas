package unidade1.gabarito_aula5;

import java.util.Scanner;

import unidade1.gabarito_aula4.Aluno;

public class TesteAlunoScaner {
    public static void main(String[] args) {
        Aluno umAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        System.out.println();
      
        System.out.println("Digite o nome do Aluno: ");
        String nomeDoAluno = teclado.nextLine();

        System.out.println("Digite o nome da mãe do Aluno: ");
        String mae = teclado.next();

        System.out.println("Digite a primeira nota do Aluno: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota do Aluno: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota do Aluno: ");
        double nota3 = teclado.nextDouble();

 
        umAluno.setNome(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setMae(mae);

        
        System.out.println(umAluno);
        teclado.close();
    }
}
