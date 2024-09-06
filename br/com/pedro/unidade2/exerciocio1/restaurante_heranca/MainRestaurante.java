package br.com.pedro.unidade2.exerciocio1.restaurante_heranca;

public class MainRestaurante {
    public static void main(String[] args) {
        Funcionario umFuncionario = new Funcionario("João", "Dono");
        Garcom umGarcom = new Garcom("Maria", "Garçom", 20.00);
        System.out.println();
        System.out.println(umFuncionario);
        System.out.println(umGarcom);
    }
}
