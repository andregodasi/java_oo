/**
 *Universidade Federal do Paraná - UFPR
*Lista 9 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
* 2. (Tarefa 10) Escreva uma thread que conte de 0 até um número fornecido no construtor
da classe. Imprimir o nome da thread e o número contato. Coloque um sleep de 1
segundo entre as contagens. Escreva um programa que instancie e inicie duas threads:
uma que conta até 10 e outra que conta até 20.

*/
package lista_threads;

public class ListaThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread[] thrd = new Thread[2];	
	
	thrd[0] = new Thread(new ContaThreads(10,"Thread 1"));
	thrd[1] = new Thread(new ContaThreads(20,"Thread 2"));
	thrd[0].start();
	thrd[1].start();
    }
    
}
