/**
* Universidade Federal do Paraná - UFPR
* Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
*4. Faça uma classe executável que dados a distância percorrida (em Km)
*e o tempo gasto em uma viagem (em horas), informe a velocidade média do
*carro, sabendo que Velocidade = S / T (variação de distância / variação do tempo).
*Imprima o valor com duas casas decimais.
*/
package lista2exercicio4andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio4andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s , t;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida.");
        s = scn.nextDouble();
        System.out.println("Digite o tempo gasto.");
        t = scn.nextDouble();
        
        System.out.printf("Velocidade media: %.2f",(s/t));
        
    }
    
}
