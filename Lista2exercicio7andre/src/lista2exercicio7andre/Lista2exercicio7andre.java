/**
 * Universidade Federal do Paraná - UFPR
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 7. Escreva um programa que leia três valores inteiros R, S e T e imprima qual
 * deles é o maior. Faça uma validação para que o usuário não insira parâmetros 
 * iguais;
 */
package lista2exercicio7andre;

import java.util.*;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio7andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        int[] ordena;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite 3 numeros inteiros e diferentes.");
        
        
        do {
            a = scn.nextInt();
            b = scn.nextInt();
            c = scn.nextInt();

            ordena = new int[3];
            ordena[0] = a;
            ordena[1] = b;
            ordena[2] = c;
            if (a != b && a != c && b != c) {

                Arrays.sort(ordena);

                int descrecente = ordena.length;
                for (int i = 0; i < ordena.length; i++) {
                    descrecente--;
                    System.out.printf("%d º numero maior %d \n", i + 1, ordena[descrecente]);
                }
            } else {
                System.out.println("Por favor, 3 numeros diferentes");
            }
        } while (a == b || a == c || b == c);

        
    }
    
}
