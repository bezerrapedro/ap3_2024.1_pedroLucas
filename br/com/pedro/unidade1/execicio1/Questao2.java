/**
 * Classe Questao2
 * 
 * Faça um programa que exiba para o usuário o menor inteiro positivo 
 * de uma lista ligada de 9999 números gerados aleatoriamente.
 * 
 * @author pedroBezerra
 * @version 2.0
 * @since 2024-08-22
 * @codigo-secreto 342492419
*/
package br.com.pedro.unidade1.execicio1;

import java.util.LinkedList;
import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        LinkedList<Integer> lista = new LinkedList<Integer>();

        for (int i = 0; i < 9999; i++) {
            int num = numeroAleatorio.nextInt();
            lista.add(num);

        }

        int menorPositivo = Integer.MAX_VALUE;
        for (int escolhido : lista) {
            if ((escolhido > 0) && (escolhido < menorPositivo)) {
                menorPositivo = escolhido;
            }

        }
        System.out.println(menorPositivo);
    }
}
