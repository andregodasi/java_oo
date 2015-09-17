/**
 *Universidade Federal do Paraná - UFPR
 *Lista 3 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 *9. Faça um programa que monte uma matriz tridimensional 5 x 10 x 3, onde o conteúdo de cada 
 * elemento é igual à soma dos valores de seus índices. Imprima a matriz ao final;
 */
package lista3exercicio9andre;

/**
 *
 * @author ANDRE
 */
public class Lista3exercicio9andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][][] = new int[5][10][3];
        
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < 5; i++) {
                    matriz[i][j][k] = i + j + k;
                }

            }
        }
        
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.printf("%d  ",matriz[i][j][k]);
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
            System.out.printf("\n");
        }
        
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.println(matriz[i][j][k]);
//                }
//
//            }
//        }
    }
}
