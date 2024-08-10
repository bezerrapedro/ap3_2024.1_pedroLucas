package br.com.pedro.unidade1.gabarito_aula5;
// agora ta tudo ok
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.pedro.unidade1.gabarito_aula4.Aluno;

public class TesteAlunoScanner {
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

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite a data do seu nascimento: dd/MM/yyyy");
        String dataNascimentoString = teclado.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, padrao);

 
        umAluno.setNome(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setMae(mae);
        umAluno.setDataNascimento(dataNascimento);

        
        System.out.println(umAluno);
        teclado.close();
    }
}
