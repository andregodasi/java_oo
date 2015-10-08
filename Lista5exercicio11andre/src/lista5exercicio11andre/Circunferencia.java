/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5exercicio11andre;

/**
 *
 * @author ANDRE
 */
public class Circunferencia extends Forma implements Superficie{

    public Circunferencia(double raio) {
        super(1); //uso obrigatorio do construtor da superclasse
        setMedida(0, raio); //ajuste da medida do raio
    }
//implementacao do metodo abstrato area

    @Override
    public double area() {
        return Math.PI * Math.pow(getMedida(0), 2);
    }

}
