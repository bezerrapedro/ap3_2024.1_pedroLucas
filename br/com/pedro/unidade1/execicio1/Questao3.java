/**
 * Classe Questao3
 * 
 * Indique a quantidade de cada um desses componentes para se 
 * obter uma certa quantidade de quilos de latão que foi requerida pelo usuário.
 * 
 * @author pedroBezerra
 * @version 2.0
 * @since 2024-08-22
 * @codigo-secreto 342492419
*/
package br.com.pedro.unidade1.execicio1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de Latão em Kg: ");
        double kg = teclado.nextDouble();
        double cobre = (kg * 0.7);
        double zinco = (kg * 0.3);

        System.out.println("Para fabricação de " + kg + " Kg de latão ");
        System.out.println("É necesssário ter " + cobre + " Kg de Cobre");
        System.out.println("É necesssário ter " + zinco + " Kg de Zinco");
        teclado.close();
    }

}
