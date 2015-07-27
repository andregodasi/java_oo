/**
 * Universidade Federal do Paraná - UFPR
 * Disiciplina de Linguagem de Programação Orientada a Objetos - 4° Periódo
 *12. (Tarefa 3)Faça um programa que calcule a variância de um determinado número
 * de amostras. O número de amostras deve ser pedido ao usuário no início do 
 * programa. Utilize array para armazenar as amostras. Os valores das amostras 
 * devem ser digitadas pelo usuário, uma a uma, como números decimais.
 */
package lista3exercicio12andre;

import java.util.Scanner;

/**
 *
 * @author andre.silva
 */
public class Lista3exercicio12andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amostra[], variancias[], media, total = 0, totalVariancia = 0;
        int tamanho;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o tamaho da amostra");
        tamanho = scn.nextInt();

        amostra = new double[tamanho];
        variancias = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite a amostra numero " + (i + 1));
            amostra[i] = scn.nextDouble();
            total += amostra[i];
        }
        media = total / tamanho;

        for (int i = 0; i < tamanho; i++) {
            variancias[i] = Math.pow((amostra[i] - media),2);
            totalVariancia += variancias[i];
        }
        
        System.out.printf("Variância = %.2f \n",(totalVariancia/(tamanho-1)));
    }
    
}
