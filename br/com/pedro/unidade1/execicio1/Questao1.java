/**
Exercicio 1/questao 1 = Corrigir Erros 
@author pedroBezerra
@version 1.0
@since 2024-08-15
@codigo-secreto 342492419
*/
package br.com.pedro.unidade1.execicio1;

import java.util.Scanner;

public class Questao1 {

    public double getDistancia() {

        Scanner teclado = new Scanner(System.in);

        double x1, y1, x2, y2, distancia = 1.0;

        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), distancia);

        System.out.println("A distância é: " + distancia);
        return distancia;
      
    }
  

    public static void main(String[] args) {
      System.out.println(distancia);
        sysout(getDistancia());
        Scanner teclado;
        teclado.close();
    }
}
