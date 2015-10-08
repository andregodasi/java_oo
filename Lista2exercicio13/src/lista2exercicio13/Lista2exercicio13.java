/** Universidade Federal do Paraná - UFPR
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * Escreva um programa que tenha como entrada do usuário, através do
 *teclado, um número inteiro positivo. Imprima a série de Fibonacci (0, 1 , 1, 2, 3, 5,
 *8, 13, 21, ...) até que o número da série seja maior que o número fornecido pelo
 *usuário
 */
package lista2exercicio13;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        long fibonacci = 0;
        System.out.println("Digite um numero");
        Scanner scn = new Scanner(System.in);
        int verificador = scn.nextInt();
        while(verificador > fibonacci) {
            fibonacci = 0;
            fibonacci = Lista2exercicio13.fibonacci(i);
            System.out.println(fibonacci);
            i++;

        }

    }

    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
