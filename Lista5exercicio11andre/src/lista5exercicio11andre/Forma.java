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
public abstract class Forma {

    private double medida[]; //array para medidas
//construtor parametrizado que aloca array de medidas

    public Forma(int numMedidas) {
        medida = new double[numMedidas];
    }
//obtem uma medida da forma

    public double getMedida(int i) {
        if ((i > 0) || (i < medida.length)) {
            return medida[i];
        } else {
            return -1;
        }
    }
//define uma medida da forma

    protected void setMedida(int i, double m) {
        if ((i > 0) || (i < medida.length) || (m < 0)) {
            medida[i] = m;
        }
    }

    //representacao textual da forma
    public String toString() {
        String bf = getClass().getSimpleName();
        bf = bf + "[medidas:";
        for (int i = 0; i < medida.length - 1; i++) {
            bf = bf + medida[i] + ",";
        }
        bf = bf + medida[medida.length - 1] + "]";
        return bf;
    }
//retorna numero de medidas da Forma

    public int getNumMedidas() {
        return medida.length;
    }
//metodo abstrato que determinara a area

   //public abstract double area();

}
