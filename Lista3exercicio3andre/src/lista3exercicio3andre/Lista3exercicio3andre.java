/**
 * Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 3. Faça uma classe executável que dado um conjunto de 20 elementos numéricos, informe a soma de 
 * todos os números pares. Faça a validação de dados inválidos informando o usuário, e fazendo-o 
 * repetir a digitação.
 */
package lista3exercicio3andre;

import java.util.*;

/**
 *
 * @author ANDRE
 */
public class Lista3exercicio3andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double array[] = new double[20];
        double aux, cont = 0;
        int i=0, j;
        System.out.println("Digite 20 numeros");
        do {
            try {
                Scanner scn = new Scanner(System.in);
                aux = scn.nextDouble();
                array[i] = aux;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Digite os dados corretos");
            }
        } while (i <= 19);

        for (j = 0; j <= 19; j++) {
            if ((array[j] % 2) == 0) {
                cont = cont + array[j];
            }
        }
        System.out.println("Soma dos numeros pares:"+ cont);
        
    }
    
}
