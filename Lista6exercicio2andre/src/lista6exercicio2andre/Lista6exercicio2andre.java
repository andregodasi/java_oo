/*
*Universidade Federal do Paraná - UFPR
*Lista 6 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
2. (Tarefa 6) Considere a classe Bicicleta abaixo:
class Bicicleta {
int cadencia = 0;
int velocidade = 0;
int marcha = 1;
void mudarCadencia(int novoValor){
cadencia = novoValor;
}
void mudarMarcha(int novoValor){
marcha = novoValor;
}
void aumentarVelocidade(int incremento){
velocidade = velocidade + incremento;
}
void aplicarFreios(int decremento){
velocidade = velocidade - decremento;
}
void printStates(){
System.out.println("cadencia="+cadencia+" velocidade="+velocidade+"
marcha="+marcha);
}
}
Crie um tratamento de exceção (com exceções monitoradas) para os seguintes casos:
 valores de velocidade negativo ou superior a 100 km/h
 valores de RPM negativo,
 Valores de Marcha negativo ou superior a 24.
a. Lance estas exceções nos métodos setVelocidade, setRPM e setMarcha
b. Crie um construtor para a classe Bicicleta
c. Crie uma classe UsaBicicleta que teste estes casos. Faça o tratamento qualificado
das exceções nesta classe.
 */
package lista6exercicio2andre;

/**
 *
 * @author ANDRE
 */
public class Lista6exercicio2andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Bicicleta bicicleta = new Bicicleta();
            bicicleta.setCadencia(10);
            bicicleta.setVelocidade(120);
            bicicleta.setMarcha(10);
            System.out.println("Objeto criado com sucesso 1");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Bicicleta bicicleta = new Bicicleta();
            bicicleta.setCadencia(-1);
            bicicleta.setVelocidade(30);
            bicicleta.setMarcha(12);
            System.out.println("Objeto criado com sucesso 2");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Bicicleta bicicleta = new Bicicleta(10, 20, 36);
            bicicleta.setCadencia(10);
            bicicleta.setVelocidade(20);
            bicicleta.setMarcha(36);
            System.out.println("Objeto criado com sucesso 3");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Bicicleta bicicleta = new Bicicleta(10, 20, 36);
            bicicleta.setCadencia(10);
            bicicleta.setVelocidade(20);
            bicicleta.setMarcha(10);
            System.out.println("Objeto criado com sucesso 4");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
