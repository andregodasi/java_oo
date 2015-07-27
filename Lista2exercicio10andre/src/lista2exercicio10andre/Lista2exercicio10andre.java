/**
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 10. Faça uma classe executável que dados o peso atual de uma pessoa e o peso 
 * desejado após processo de emagrecimento (informe isso ao
 * programa por meio dos argumentos de entrada (args)), informe o percentual do
 * peso que deverá ser eliminado
 */
package lista2exercicio10andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio10andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pinicial, pfinal;
        System.out.println("programa de calculo de porcentagem de peso");
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o peso inicial");
        pinicial = scn.nextDouble();
        System.out.println("Digite o peso final");
        pfinal = scn.nextDouble();
        double pesoPerdido = ((pinicial - pfinal)*pinicial / 100);
        System.out.printf("Porcentagem de peso perdido: %.2f %% \n", pesoPerdido);
        
    }
    
}
