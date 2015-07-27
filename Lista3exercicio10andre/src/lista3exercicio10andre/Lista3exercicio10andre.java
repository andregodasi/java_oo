/**
 *Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 *10. Construa um programa que calcule o determinante de uma matriz 3 x 3 fornecida pelo usuário;
 */
package lista3exercicio10andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista3exercicio10andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int aux,diagP=0,diagS=0;
        System.out.println("Calculo de uma matriz determinante");
        Scanner scn = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o numero que ira ficar na linha %d e na coluna %d \n",i+1,j+1);
                aux = scn.nextInt();
                matriz[i][j] = aux;
            }
        }
        //Diagonal principal
        diagP = (+ matriz[0][0] * matriz[1][1] * matriz[2][2])+
                (+ matriz[0][1] * matriz[1][2] * matriz[2][0])+
                (+matriz[0][2] * matriz[1][0] * matriz[2][1]);
        //Diagonal secundaria
        diagP = (- matriz[0][2] * matriz[1][1] * matriz[2][0])
                +(- matriz[0][1] * matriz[1][0] * matriz[2][2])
                +(- matriz[0][0] * matriz[1][2] * matriz[2][1]);
        
        System.out.printf("Determinante %d \n",diagP + diagS);
    }
    
}
