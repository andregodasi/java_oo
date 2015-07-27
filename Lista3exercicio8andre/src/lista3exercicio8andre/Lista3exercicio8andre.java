/**
 *Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 *8. Faça um programa que leia uma frase e informe se ela é um palíndromo ou não.
 * Uma frase é um palíndromo quando pode ser lida tanto da forma usual, quanto 
 * de trás para frente. O programa deve ignorar maiúsculas e minúsculas na 
 * avaliação. Insira as frases sem acentuação;
 * Dica: será necessário verificar os métodos disponíveis na classe String;
 * "Socorram-me, subi no ônibus em Marrocos”
 * "A Rita, sobre vovô, verbos atira."
 * "Olé! Maracujá, caju, caramelo."
 */
package lista3exercicio8andre;

import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author andre.silva
 */
public class Lista3exercicio8andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase,resultado="",fraseori;
        System.out.println("Digite uma frase para verifica se a mesma é um polídromo.");
        Scanner scn = new Scanner(System.in);
        
        frase = scn.nextLine();
        fraseori = frase;
        frase = frase.replaceAll(" ", "");
        frase = frase.replaceAll("\\.", "");
        frase = frase.replaceAll("!", "");
        frase = frase.replaceAll("-", "");
        frase = frase.replaceAll(",", "");
        frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
        frase = frase.replaceAll("[^\\p{ASCII}]", "");
        frase = frase.toLowerCase();
        
        for (int x = frase.length() - 1; x >= 0; x--) {
            resultado += frase.charAt(x);
        }
        if (resultado.equalsIgnoreCase(frase)) {
            System.out.println("A frase: " + fraseori + " é um PALINDROMO");
        } else {
            System.out.println("A frase: " + fraseori + " NÃO é um PALINDROMO");;
        }
    }
    
}
