/**
 * Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 4. Dados os valores de um depósito fixo mensal e um montante desejado, determine quantos meses 
 * são necessários para acumular o montante desejado, considerando juros mensais de 0,5%. Resolva
 * com iterações (sem a fórmula de juros compostos) e imprima os valores mês a mês e o valor final.
 * Obtenha as entradas do teclado.
 */
package lista3exercicio4andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista3exercicio4andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mon, dep, soma=0, juros;
        int mes=0;
        System.out.println("Digite o valor do deposito e o valor do montante.");
        
        Scanner scn = new Scanner(System.in);
        dep = scn.nextDouble();
        mon = scn.nextDouble();
        
        do{
            
            soma = soma+(soma*0.5/100)+dep;
            juros = soma*0.5/100;
            mes++;
            
            System.out.printf("Mês: %d e montante acumulado até o momento: R$%.2f \n", mes, soma);
        }while (soma < mon);
    }
    
}
