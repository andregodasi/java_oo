/**
 *Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 *11. Escreva um programa que calcule a soma das diagonais principal e secundária.
 * O programa deve perguntar ao usuário a dimensão da matriz. Baseado na dimensão da matriz o 
 * programa deve pedir ao usuário para preencher os valores da matriz (faça um método estático 
 * que receba a referência de uma matriz e a preencha). Com a matriz preenchida faça outro método 
 * estático que calcule a soma das diagonais. Imprima o resultado.
 */
package lista3exercicio11andre;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista3exercicio11andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux, matriz[][];
        
        System.out.println("Digite a dimenção da matriz");
        Scanner scn = new Scanner(System.in);
        aux = scn.nextInt();
        matriz = new int[aux][aux];
        matriz = preencheMatriz(aux);
        somaDiagonalPrincipalESecundaria(matriz);
        
    }
    public static int[][] preencheMatriz(int aux) {
        int valor;
        int matriz[][] = new int[aux][aux];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < aux; j++) {
                System.out.println("Digite um valor que ficara na linha "+(i+1)+" e na coluna "+(j+1));
                valor = scn.nextInt();
                matriz[i][j]=valor;
            }
        }
        return matriz;
        
    }
    public static void somaDiagonalPrincipalESecundaria(int matriz[][]) {
        int smdp = 0, smds = 0,mapeiaDiagonalSecundariaIncrementa = 0,mapeiaDiagonalSecundariaDecrementa = matriz.length -1 ;
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%da. linha: ", (i + 1));
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ", matriz[i][j]);

                if (i == j) // diagonal principal
                {
                    smdp = smdp + matriz[i][j];
                }

                if ((i == mapeiaDiagonalSecundariaIncrementa) && (j == mapeiaDiagonalSecundariaDecrementa)) // diagonal secundaria
                {
                    smds = smds + matriz[i][j];
                    mapeiaDiagonalSecundariaIncrementa++;
                    mapeiaDiagonalSecundariaDecrementa--;
                }
            }
            System.out.printf("\n");

        }
        
            System.out.println("Soma da diagonal principal e diagonal secundaria "+(smdp+(smds)));
    }
}