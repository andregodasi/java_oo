/**
* Universidade Federal do Paraná - UFPR
*Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
*5. (Tarefa 2) Faça uma classe executável que dados a quantidade de DVDs que 
*uma vídeo locadora possui e o valor que ela cobra por cada aluguel, informe:
*a. Sabendo que um terço dos DVDs são alugadas por mês, o seu faturamento anual.
*b. Sabendo que quando o cliente atrasa a entrega, é cobrada uma multa de 10% 
*sobre o valor do aluguel e que um décimo das fitas alugadas no mês são 
*devolvidas com atraso, o valor ganho com multas por mês.
*c. Formate a saída para aparecer com duas casas decimais e (R$) na frente.
*d. Faça comentários na classe e gere o JavaDoc.
*/
package lista2exercicio5andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio5andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quantidade;
        double valor;
        
        System.out.println("Sistema video locadora");
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a quantidade de Dvds da video locadora.");
        quantidade = scn.nextInt();
        System.out.println("Digite a o valor do aluguel de cada Dvd.");
        valor = scn.nextDouble();
        
        System.out.printf("Faturamento anual: R$ %.2f \n", (((quantidade/3)*1.10)*valor*12));
        System.out.printf("Valor ganho com multa por mês: R$ %.2f \n",((quantidade/3)*0.10)*valor);
        
    }
    
}
