public class TestaAluno {
    public static void main(String[] args) {

        Aluno pedro = new Aluno();
        pedro.setNome("Pedro Lucas");
        pedro.setNota1(10);
        pedro.setNota2(7);
        pedro.setNota3(5);
        System.out.println();
        System.out.println(pedro);

        if (pedro.aprovadoMedia())
            System.out.println("Passou por média!");
        else
            System.out.println("Ixe, reprovou pq tirou " + pedro.getMedia());
    }
}
