/*
 Universidade Federal do Paraná - UFPR
 *Lista 5 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
13. Crie uma estrutura de classes que represente diferentes tipos de Veículos. A
superclasse chama-se Veiculo. Esta possui três subclasses, VeiculoTerrestre,
VeiculoAereo, VeiculoAquatico, que possuem, respectivamente, as subclasses Carro e
Trem, Avião e Barco. Crie atributos, getters e setters coerentes com a hierarquia. Toda a
hierarquia deve possuir uma operação andar(), que deve ser abstrata nos dois primeiros
níveis e implementada nas classes de nível mais baixo. Sua implementação consiste em
imprimir no console o movimento executado.
a. A classe Veiculo deve possuir um construtor com parâmetros que inicializa seus
atributos. As classes filhas devem possuir, também, construtores com parâmetros
que, além de chamar o construtor da superclasse, define seus próprios atributos.
b. Para testar o funcionamento das classes, faça um programa que permita ao usuário
escolher qual tipo de veículo deseja criar e realize o movimento correspondente.
Independentemente do tipo de veículo escolhido, a instância deve ser do tipo Veiculo;
c. Utilizando a hierarquia de classes, faça um programa em que o usuário informa dados
de veículos. O programa inicia solicitando ao usuário quantos veículos deseja
informar. Para cada um dos veículos, o programa deve identificar seu tipo e ler as
informações correspondentes. Os dados informados devem ser armazenados em um
único vetor, que deve conter todos os objetos de veículos.
d. Depois de ler todas as informações, o programa deve invocar o método andar() de
todos os veículos armazenados.
 */
package lista5exercicio13andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista5exercicio13andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 0;
        String nome = null;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a quantidade de veiculos que deseja cadastrar.");
        int quantidade = scn.nextInt();
        Veiculo listaVeiculos[] = new Veiculo[quantidade];

        while (quantidade > c) {

            System.out.println("Digite o veiculo que deseja cadastrar");
            nome = scn.next();

            switch (nome) {
                case "carro":
                    System.out.println("Digite a marca a quandidade de rodas e a velocidade");
                    String marcaCarro = scn.next();
                    int quantidadeDeRodas = scn.nextInt();
                    double velocidadeCarro = scn.nextDouble();
                    Carro carro = new Carro(marcaCarro, quantidadeDeRodas, velocidadeCarro, nome);

                    listaVeiculos[c] = carro;
                    c++;

                    break;

                case "trem":
                    System.out.println("Digite a marca a quandidade de vagoes e a velocidade");
                    String marcaTrem = scn.next();
                    int quantidadeDeVagoes = scn.nextInt();
                    double velocidadeTrem = scn.nextDouble();
                    Trem trem = new Trem(marcaTrem, quantidadeDeVagoes, velocidadeTrem, nome);

                    listaVeiculos[c] = trem;
                    c++;

                    break;

                case "aviao":
                    System.out.println("Digite a marca a quandidade de rodas e a velocidade");
                    String marcaAviao = scn.next();
                    int quantidadeDeAsas = scn.nextInt();
                    double velocidadeAviao = scn.nextDouble();
                    Aviao aviao = new Aviao(marcaAviao, quantidadeDeAsas, velocidadeAviao, nome);

                    listaVeiculos[c] = aviao;
                    c++;

                    break;

                case "barco":
                    System.out.println("Digite a marca a quandidade de helices e a velocidade");
                    String marcaBarco = scn.next();
                    int quantidadeDeHelices = scn.nextInt();
                    double velocidadeBarco = scn.nextDouble();
                    Barco barco = new Barco(marcaBarco, quantidadeDeHelices, velocidadeBarco, nome);

                    listaVeiculos[c] = barco;
                    c++;

                    break;

                default:
                    System.out.println("Não reconhecemos esse veiculo tente novamente");
                    break;
            }

        }

        for (Veiculo veiculo : listaVeiculos) {
            veiculo.andar();
        }

    }
}
