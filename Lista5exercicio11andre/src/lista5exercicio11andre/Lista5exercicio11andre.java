/*
 *Universidade Federal do Paraná - UFPR
 *Lista 5 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
11.Altere as classes Quadrado e Circunferencia dos exercícios de aulas
anteriores para que implementem a interface Superficie indicada abaixo. Para testar,
atribua instâncias de Quadrado e Circunferencia para uma referência à interface e
invoque métodos a partir dela.
public interface Superficie {
public double area();
}
 */
package lista5exercicio11andre;

/**
 *
 * @author ANDRE
 */
public class Lista5exercicio11andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Quadrado quadrado = new Quadrado(50);
        
        Circunferencia circunferencia = new Circunferencia(10);
        
        System.out.println("Superficie do Quadrado: "+ quadrado.area());
        
        System.out.println("Superficie da circunferencia: "+ circunferencia.area());
    }
    
}
