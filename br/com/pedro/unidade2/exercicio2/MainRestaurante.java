package br.com.pedro.unidade2.exercicio2;

import br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo.AuxiliarCozinha;
import br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo.Barman;
import br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo.Estacao;
import br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo.Funcionario;
import br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo.Garcom;

public class MainRestaurante {
    public static void main(String[] args) {
        comPolimorfismo();

    }

    public static void comPolimorfismo() {
 
        Funcionario umGarcom = new Garcom("pedro", "Garçom", 5);
        Funcionario umAuxiliar = new AuxiliarCozinha("Julio", "Auxiliar de cozinha ", Estacao.FRITURA);
        Funcionario umBarman = new Barman("Caio", "Barman", "cachaça");

        umGarcom.trabalhar();
        umAuxiliar.trabalhar();
        umBarman.trabalhar();
    }

}
