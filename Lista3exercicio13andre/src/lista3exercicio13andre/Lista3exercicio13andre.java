/**
 * Universidade Federal do Paraná - UFPR
 * Disiciplina de Linguagem de Programação Orientada a Objetos - 4° Periódo
 *13. (Tarefa 3)Leia um conjunto de 10 strings do teclado. Coloque as 10 strings 
 * e um array. Peça ao usuário para digitar uma string de busca e retorne em 
 * qual posição a string de busca foi encontrada. Crie um método estático para 
 * leitura do array de strings e outro método para busca da string. Utilize 
 * passagem de parâmetros.
 */
package lista3exercicio13andre;

import java.util.Scanner;

/**
 *
 * @author andre.silva
 */
public class Lista3exercicio13andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string[] = new String[10], stringRecebe[] = new String[10], procura;
        
        Scanner scn = new Scanner(System.in);
        stringRecebe = leituraString(string);
        System.out.println("Digite a String que esta procurando");
        procura = scn.next();
        procuraString(stringRecebe, procura);
        
    }
    
    public static String[] leituraString(String string[]) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite sua " + (i + 1) + "º String");
            string[i] = scn.next();
        }
        System.out.println("Leitura realizada com sucesso");
        return string;
    }
    public static void procuraString(String string[] ,String x) {
        for (int i = 0; i < 10; i++) {
            if(string[i].equals(x)){
                System.out.println("A String procurada é "+x+" que estava no indice "+(i+1));
            }
        }
    }
}
