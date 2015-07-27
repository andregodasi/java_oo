/**
 * Universidade Federal do Paraná - UFPR
 * Lista 2 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * 11. Implemente um programa que calcule o bônus anual de um 
 * funcionário de uma empresa. O programa pede para o usuário os seguintes 
 * dados: Cargo do funcionário e salário atual. Se o cargo for diretor o 
 * sistema pede quantidade de departamentos gerenciados. Se o cargo for gerente 
 * o sistema pede a quantidade de pessoas gerenciadas. Não é necessário fazer
 * tratamento de entrada de dados. O cálculo do bônus anual segue as seguintes
 * regras.
*a. Para Diretor:
* i. 4 salários + R$3000,00 por departamento gerenciado
* b. Para Gerente
* i. 2 salários + R$100,00 por pessoa gerenciada
* c. Analista
* i. 1 salário
* d. Programador
* i. 0,8 salário
* e. Auxiliar de Limpeza
* i. 0,5 salário
 */
package lista2exercicio11andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista2exercicio11andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cargo;
        double salario , bonus;
        int departamento, pessoa;
        System.out.println("Programa de calculo de bonus.");
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite seu cargo");
        System.out.println("Cargos existentes \n"
                + "1 - diretor \n"
                + "2 - gerente \n"
                + "3 - analista \n"
                + "4 - programado \n"
                + "5 - auxiliar de limpeza");
        cargo = scn.next();
        
        System.out.println("Digite seu salario atual.");
        salario = scn.nextDouble();
        
        switch (cargo) {
            case "diretor":
                System.out.println("Digite quantos departamento você gerencia ?");
                departamento = scn.nextInt();
                bonus = 4*salario + (departamento * 3000);
                System.out.printf("Seu bonus é: R$ %.2f \n", bonus);
                break;
            case "gerente":
                System.out.println("Digite quantos departamento você gerencia ?");
                pessoa = scn.nextInt();
                bonus = 2*salario + (pessoa * 100);
                System.out.printf("Seu bonus é: R$ %.2f \n", bonus);
                break;
            case "analista":
                bonus = salario;
                System.out.printf("Seu bonus é: R$ %.2f \n", bonus);
                break;
            case "programador":
                bonus = salario * 0.8;
                System.out.printf("Seu bonus é: R$ %.2f \n", bonus);
                break;
            case "auxiliar de limpeza":
                bonus = salario * 0.5;
                System.out.printf("Seu bonus é: R$ %.2f \n", bonus);
                break;
            default:
                System.out.println("Sem bonus");
        }
        
        
        
        
    }
    
}
