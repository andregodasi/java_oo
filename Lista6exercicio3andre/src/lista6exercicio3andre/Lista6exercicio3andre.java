/*
*Universidade Federal do Paraná - UFPR
*Lista 6 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
3. (Tarefa 6) Modifique a classe Retangulo, para que uma exceção
IllegalArgumentException seja lançada se os lados informados forem negativos. Adapte
adequadamente o programa principal, para que a exceção seja capturada
 */
package lista6exercicio3andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista6exercicio3andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Boolean b = false;
        
        while (b != true) {
            System.out.println("Digite a altura do retangulo");
            int altura = scn.nextInt();
            System.out.println("Digite a largura do retangulo");
            int largura = scn.nextInt();
            try {
                
            
            if(altura < 0) {
                throw new IllegalArgumentException("Altura menor que zero");
            } else if (largura < 0) {
                throw new IllegalArgumentException("Largura menor que zero");
            } else {
                Retangulo retangulo = new Retangulo(altura, largura);
                System.out.println("Passou");
                b = true;
            }
                } catch (Exception e) {
                    System.out.println(e);
            }
            

        }
    }

}
