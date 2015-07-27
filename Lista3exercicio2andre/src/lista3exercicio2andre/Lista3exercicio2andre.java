/**
 * Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 2. Construa um programa que seja capaz de efetuar a média de todos os argumentos inteiros ou 
 * reais recebidos do teclado e imprimi-los. Argumentos inválidos devem ser desconsiderados 
 * (Imprimir uma mensagem para cada valor inválido.), sem provocar a exibição de exceções (Exiba 
 * uma mensagem para o usuário pedindo a ele que informe novamente o valor). O usuário deve digitar
 * S quando desejar encerrar a entrada de dados;
 */
package lista3exercicio2andre;

import static java.lang.System.in;
import java.util.*;

/**
 *
 * @author ANDRE
 */
public class Lista3exercicio2andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double media, aux, cont = 0;
    int i = 0;
    String txt = null;
    
        do {
            try {
                System.out.println("Digite um numero inteiro ou real ou s para finalizar o programa");
                aux = 0;
                Scanner scn = new Scanner(System.in);
                txt = scn.next();
                if ("s".equals(txt)) {
                    System.out.println("Promagra finalizado");
                    break;
                }
                aux = Double.parseDouble(txt);

                cont = cont + aux;
                i++;
                media = cont / i;
                System.out.println("Media:" + media);
            } catch (NumberFormatException ime) {
                System.out.println("Por favor insira os dados corretos.");
            }
        } while (!"s".equals(txt));

        
        
    }
    
}
