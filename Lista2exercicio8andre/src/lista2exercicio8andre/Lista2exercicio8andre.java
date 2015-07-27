/**
 * Universidade Federal do Paraná - UFPR
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periódo
 * 8. Construa um programa que leia do teclado dois pontos em um plano
 * (x,y) e informe a distância entre eles.
 */
package lista2exercicio8andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio8andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int xa, xb, ya, yb;
        Scanner scn = new Scanner(System.in);
        System.out.println("Calculando a distancia de dois pontos em um plano cartesiano.");
        System.out.println("Digite a posição X do primeiro ponto");
        xa = scn.nextInt();
        System.out.println("Digite a posição Y do primeiro ponto");
        ya = scn.nextInt();
        System.out.println("Digite a posição X do segundo ponto");
        xb = scn.nextInt();
        System.out.println("Digite a posição Y do segundo ponto");
        yb = scn.nextInt();

        double distancia = Math.sqrt((Math.pow((xb - xa), 2)) + (Math.pow((yb - ya), 2)));
        System.out.printf("Distância entre os dois pontos é de %.2f \n", distancia);

    }

}
