/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6exercicio2andre;

/**
 *
 * @author ANDRE
 */
public class Bicicleta {
    private int cadencia = 0;
    private int velocidade = 0;
    private int marcha = 1;

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) throws Exception {
         if (cadencia < 0) {
            throw new Exception("Cadencia menor que 0");
        } else {
           this.cadencia = cadencia;
        }
        
    }

    public Bicicleta() {
    }

    public Bicicleta(int cadencia, int velocidade, int marcha) {
        this.cadencia = cadencia;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) throws Exception {
         if (velocidade > 100) {
            throw new Exception("Velocidade maior que 100km");
        } else if (velocidade < 0) {
            throw new Exception("Velocidade ,menor que 0km");
        } else {
             this.velocidade = velocidade;
        }
       
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) throws Exception {
        if (marcha > 24) {
            throw new Exception("marcha maior que 24");
        } else if (marcha < 0) {
            throw new Exception("marcha menor que 0");
        } else {
            this.marcha = marcha;
        }
       
    }

    void mudarCadencia(int novoValor) throws Exception {
        if (novoValor < 0) {
            throw new Exception("cadencia menor que 0");
        } else {
           cadencia = novoValor;
        }
       
    }

    void mudarMarcha(int novoValor) {
        marcha = novoValor;
    }

    void aumentarVelocidade(int incremento) throws Exception {
        int velocidadeAmentada = velocidade + incremento;
        if (velocidadeAmentada > 100) {
            throw new Exception("Velocidade maior que 100km");
        } else if (velocidadeAmentada < 0) {
            throw new Exception("Velocidade ,menor que 0km");
        } else {
            velocidade = velocidadeAmentada;
        }
    }

    void aplicarFreios(int decremento) {
        velocidade = velocidade - decremento;
    }

    void printStates() {
        System.out.println("cadencia=" + cadencia + " velocidade=" + velocidade +
        "marcha ="+marcha);
}

    
}
