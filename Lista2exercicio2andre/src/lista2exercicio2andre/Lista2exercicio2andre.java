/**
 * Universidade Federal do Paraná - UFPR
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 *2. Dado um terreno retangular, do qual são conhecidos largura e comprimento, 
 *escreva um programa que calcule e exiba os valores de seu perímetro e área. 
 *Os valores de largura e comprimento devem ser lidos do teclado;
 */
package lista2exercicio2andre;

import java.util.Scanner;
/**
 *
 * @author ANDRE
 */
public class Lista2exercicio2andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int altura;
        int largura;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a altura:");
        altura = scn.nextInt();
        System.out.println("Digite uma largura:");
        largura = scn.nextInt();
        
        System.out.println(" Perimetro do retangulo = " + (2*largura + 2*altura));
        System.out.println(" Areá do retangulo = "+ (largura*altura));
        
       
    }
    
}
