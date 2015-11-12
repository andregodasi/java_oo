package lista_threads;

import static java.lang.Thread.sleep;


public class ContaThreads extends Thread implements Runnable {
    private static int cont= 0;
	private int contaAte = 0;
	private int limite = 0;
	String nome;

	//metodo para inserir até quanto a thread ira contar e o nome da thread
	public ContaThreads(int contaAte, String nome){
		this.contaAte = contaAte;
		this.nome = nome;
	}
	@Override
	public void run() {	
		for(int c=0; c<=contaAte; c++ ){;
			System.out.println(this.nome + " num: " + c); // imprime nome da thread e o numero
			try {
				sleep(1000); //1 segundo de pausa entre cada execucao
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
