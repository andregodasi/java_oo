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
public class Quadrado extends Forma implements Superficie{

    public Quadrado(double lado) {
        super(2); //uso obrigatorio do construtor da super classe
        setMedida(0, lado);
        
    }
//implementacao do metodo abstrato area

    @Override
    public double area() {
        return getMedida(0) * getMedida(0);
    }
//implementacao de metodo especifico desta subclasse

    public double perimetro() {
        return 2 * (getMedida(0) + getMedida(1));
    }

}
