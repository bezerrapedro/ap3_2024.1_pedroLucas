/**
Exercicio 1/questao 1 = Corrigir Erros 
@author pedroBezerra
@version 1.0
@since 2024-08-17
@codigo-secreto 342492419
*/
package br.com.pedro.unidade1.execicio1;

import java.util.Scanner;

public class Questao1 {

    double x1, y1, x2, y2, distancia = 1.0, amplitude = 1.0;

    public double getDistancia() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();
        teclado.close();
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância é: " + distancia);
        return distancia;

    }

    public double getAmpltude() {

        double xA1 = this.x1;
        double xA2 = this.x2;
        double yA1 = this.y1;
        double yA2 = this.y2;

        double amplitudeX = Math.abs(xA2 - xA1);
        double amplitudeY = Math.abs(yA2 - yA1);

        System.out.println("A amplitude X é: " + amplitudeX);
        System.out.println("A amplitude Y é: " + amplitudeY);

        return amplitudeX + amplitudeY;

    }

    public static void main(String[] args) {
        Questao1 questao1 = new Questao1();
        questao1.getDistancia();
        questao1.getAmpltude();
    }
}
