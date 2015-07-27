/**
* Universidade Federal do Paraná - UFPR
* Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
* 9. (Tarefa 2) Construa um programa que leia os coeficientes de uma equação do
* segundo grau do teclado e mostre os valores de x da equação;
*  FORMULA DE BASKARA
*a. Verifique na documentação Java as operações matemáticas da classe Math;
*b. Não é necessário validar tipos de raízes;
*c. Dados para teste:
* x2 – 9 = 0 Resultado: x = 3 e x = -3
* x2 -9x = 0 Resultado: x = 0 e x = 9
* 3x2 -7x + 2 = 0 Resultado: x = 1/3 e x = 2
* -x2 + 4x – 4 =0 Resultado: x = 2 e x = 2
*/
package lista2exercicio9andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio9andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Resolvendo equação do segundo grau");
        System.out.println("Digite a");
        a = scn.nextDouble();
        System.out.println("Digite b");
        b = scn.nextDouble();
        System.out.println("Digite c");
        c = scn.nextDouble();

        double x1 = ((-b + (Math.sqrt(((Math.pow(b, 2)) - 4 * a * c)))) / (2 * a));
        double x2 = ((-b - (Math.sqrt(((Math.pow(b, 2) - 4 * a * c))))) / (2 * a));
        
        System.out.printf("X1 = %.2f \n", x1);
        System.out.printf("X2 = %.2f \n", x2);
    }
    
}
