/**
* Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
*6. Escreva um programa que leia do teclado 31 valores reais correspondentes ao índice
*pluviométrico diário de um mês. Após a leitura, o programa deve determinar o índice
*pluviométrico médio, o índice pluviométrico máximo e o dia da ocorrência;
*/
package lista3exercicio6andre;

import java.util.Scanner;

/**
 *
 * @author andre.silva
 */
public class Lista3exercicio6andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double array[] = new double[31];
        double aux, max = 0, nivel = 0;
        int cont = 0, dia = 0;
        System.out.println("Digite o nivel pluviométrico do mes com 31 dias");
        while (cont <= 30) {
            Scanner scn = new Scanner(System.in);
            aux = scn.nextDouble();
            array[cont] = aux;
            if (array[cont] >= max) {
                max = array[cont];
                dia = cont + 1;
            }
             cont++;
        }
        for (int i = 0; i <= 30; i++) {
            nivel = nivel + array[i];
            
        }
        nivel = nivel/array.length;
        System.out.printf("Nivel pluviométrico médio: %.2f mm \n", nivel);
        System.out.printf("Maxima no nivel pluviométrico %.2f mm no dia %d \n", max, dia);
    }
    
}
