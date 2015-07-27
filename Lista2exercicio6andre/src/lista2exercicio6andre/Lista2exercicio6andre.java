/**
 * Universidade Federal do Paraná - UFPR
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 6. Crie um programa que leia um valor inteiro e um real, realize a sua soma e
 * exiba o resultado no console como real, formatado com três casas decimais. 
 * Verifique a tabela de formatação para printf disponível em 
 * http://download.oracle.com/javase/7/docs/api/ , classe Formatter;
 */
package lista2exercicio6andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio6andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        float b;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o numero inteiro.");
        a = scn.nextInt();
        System.out.println("Digite um numero real.");
        b = scn.nextFloat();
        
        System.out.printf("Soma dos numeros inteiro e real: %.3f \n", (a+b));
        
    }
    
}
