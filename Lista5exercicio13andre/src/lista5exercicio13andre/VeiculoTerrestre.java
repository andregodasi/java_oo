/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5exercicio13andre;

/**
 *
 * @author ANDRE
 */
public abstract class VeiculoTerrestre extends Veiculo{
    private double velocidadeEmKm;

    public VeiculoTerrestre(double velocidadeEmKm, String nome) {
        super(nome);
        this.velocidadeEmKm = velocidadeEmKm;
    }
    
    @Override
    public abstract void andar();

    public double getVelocidadeEmKm() {
        return velocidadeEmKm;
    }

    public void setVelocidadeEmKm(double velocidadeEmKm) {
        this.velocidadeEmKm = velocidadeEmKm;
    }
}
