/**
 * Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 7. Faça um programa que leia uma lista de números inteiros terminado por
 * 9999 e mostre cada número lido. Ao final, o programa deve mostrar a média 
 * aritmética dos números lidos;
 */
package lista3exercicio7andre;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andre.silva
 */
public class Lista3exercicio7andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> listanum = new ArrayList<>();
       int aux, cont = 0, soma = 0;
       double media=0;
       
        
       do{
           Scanner scn = new Scanner(System.in);
           aux = scn.nextInt();
           if(aux!=9999){
           listanum.add(aux);
           cont++;}
       }while(aux != 9999);
       
       for(Integer n : listanum){
           soma+=n;
           System.out.printf("Numero: %d \n", n);
       }
       media=(double)soma;
        System.out.printf("Média aritmética dos números lidos: %.2f \n",media/listanum.size());
        
        
    }
    
}
