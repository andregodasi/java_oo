/**
 * Universidade Federal do Paraná - UFPR
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 3. Escreva um programa que leia um valor inteiro N e determine se o mesmo
 * é par ou ímpar. O valor deve ser lido do teclado.
 */
package lista2exercicio3andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio3andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n;
       
        System.out.println("Digite um numero !");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        if(n%2==0){
            System.out.println("Numero par.");
        }else{
            System.out.println("Numero impar");
        }
            
       
    }
    
}
