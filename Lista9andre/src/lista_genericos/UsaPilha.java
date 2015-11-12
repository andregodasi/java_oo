/**
 *Universidade Federal do Paraná - UFPR
*Lista 9 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
* 2. (Tarefa 9) Construir uma classe genérica de pilha (nome: Pilha) sem usar nenhuma
classe de Collection. Use o first-in – last-out (FILO). Sobrescreva o método toString()
para que imprima a lista no seguinte formato:
[ Elemento01 , Elemento02 , Elemento03 ]
A seguinte classe deve ser utilizada para testar a sua pilha:
public class UsaPilha {
 public static void main(String[] args) throws Exception{
 Pilha <Integer> p1 = new Pilha <Integer>();
 p1.empilha(10);
 p1.empilha(20);
 p1.empilha(30);
 System.out.println(p1.toString());
 p1.desempilha();
 p1.desempilha();
 System.out.println(p1.toString());
 Pilha <String> p2 = new Pilha <String>();
 p2.empilha("Isto");
 p2.empilha("é");
 p2.empilha("uma");
 p2.empilha("pilha");
 p2.empilha("FILO");
 System.out.println(p2.toString());
 p2.desempilha();
 p2.desempilha();
 p2.desempilha();
 System.out.println(p2.toString());
 }
}
O seguinte resultado deve ser apresentado para a execução acima:
[ 30 , 20 , 10 ]
[ 10 ]
[ FILO , pilha , uma , é , Isto ]
[ é , Isto ]

*/
package lista_genericos;

public class UsaPilha {

    public static void main(String[] args) {
        Pilha <Integer> p1 = new Pilha <>();
		p1.empilha(10);
		p1.empilha(20);
		p1.empilha(30);
		System.out.println(p1.toString());
		p1.desempilha();
		p1.desempilha();
		System.out.println(p1.toString());
		Pilha <String> p2 = new Pilha <>();
		p2.empilha("Isto");
		p2.empilha("é");
		p2.empilha("uma");
		p2.empilha("pilha");
		p2.empilha("FILO");
		System.out.println(p2.toString());
		p2.desempilha();
		p2.desempilha();
		p2.desempilha();
		System.out.println(p2.toString());
    }
    
}
