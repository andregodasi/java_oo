/*
 *Universidade Federal do Paraná - UFPR
*Lista 6 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
5. (Tarefa 6) Crie uma classe com um método main, que receba do usuário valores de
entrada (utilize a classe Scanner) e retorne a soma e a média destes valores. Por meio
de tratamento de exceção, o programa deve pedir ao usuário que repita a digitação,
quando o valor digitado não for um numérico válido. O usuário também tem a opção de
sair do programa digitando a letra “S” ou “s” no lugar de um número. Abaixo está um
exemplo de saída para este programa:
Informe os números na sequencia solicitada.
Para sair digite 'S'
Numero 1=5
Numero 2=5
Numero 3=tr5
Erro de entrada.
tr5 não é um numérico válido. Tente novamente ou digite S para sair.
Numero 3=s
 */
package lista6exercicio5andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista6exercicio5andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String opcao = "n";
        String numeroTexto1 = null;
        String numeroTexto2 = null;
        String numeroTexto3 = null;
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        while ((!opcao.equals("S")) || (!opcao.equals("s"))) {
            try {
                System.out.println("digite o 1º numero");
                numeroTexto1 = scn.next();
                if (numeroTexto1.equals("S") || numeroTexto1.equals("s")) {
                    break;
                }
                numero1 = Integer.parseInt(numeroTexto1);
            } catch (Exception e) {
                System.out.println(numeroTexto1 + " não é um numérico válido. Tente novamente ou digite S para sair.");
            }
            try {
                System.out.println("digite o 2º numero");
                numeroTexto2 = scn.next();
                if (numeroTexto2.equals("S") || numeroTexto2.equals("s")) {
                    break;
                }
                numero2 = Integer.parseInt(numeroTexto2);
            } catch (Exception e) {
                System.out.println(numeroTexto1 + " não é um numérico válido. Tente novamente ou digite S para sair.");
            }
            try {
                System.out.println("digite o 1º numero");
                numeroTexto3 = scn.next();
                if (numeroTexto3.equals("S") || numeroTexto3.equals("s")) {
                    break;
                }
                numero3 = Integer.parseInt(numeroTexto3);
            } catch (Exception e) {
                System.out.println(numeroTexto1 + " não é um numérico válido. Tente novamente ou digite S para sair.");
            }

            if (numero1 != 0 && numero2 != 0 && numero3 != 0) {
                System.out.println("Soma dos numeros= " + (numero1 + numero2 + numero3));
                System.out.println("Media dos numeros= " + ((numero1 + numero2 + numero3) / 3));
            }
        }

    }

}
