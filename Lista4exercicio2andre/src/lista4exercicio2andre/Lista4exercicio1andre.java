/**
 *Universidade Federal do Paraná - UFPR
 *Lista 4 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 *2. (Tarefa 4) Escreva a estrutura de uma classe (atributos e métodos) para representar uma Pessoa 
 * (nome, idade e endereço):
 *a. Compile a classe;
 *b. Crie uma outra classe que utilize um objeto Pessoa. Leia informações de nome, idade e endereço,
 * e mostre todos os dados e a idade da pessoa. O programa deve usar os métodos do objeto.
 *c. Acrescente dois métodos:
 * fazAniversario(): que incrementa a idade da pessoa
 * imprime(): Que imprime de forma legível todos os atributos da pessoa
 *d. Altere o método main (que utiliza a classe pessoa) para que instancie uma pessoa, utilize algumas vezes o método fazAniversario e imprima os atributos do objeto pessoa.
 */
package lista4exercicio2andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista4exercicio1andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Cadastre uma pessoa. Digite endereço, idade e nome ");
     
        
        
        Pessoa p1 = new Pessoa();
        p1.setEndereco(scn.nextLine());
        p1.setNome(scn.nextLine());
        p1.setIdade(scn.nextInt());
     
        
        
        System.out.println("Nome:"+p1.getNome());
        System.out.println("Idade:"+p1.getIdade());
        System.out.println("Endereço:"+p1.getEndereco());
    }
    
}
