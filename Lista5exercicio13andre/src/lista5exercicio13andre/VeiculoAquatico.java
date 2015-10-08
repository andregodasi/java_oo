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
public abstract class VeiculoAquatico extends Veiculo{
    private double velocidadeEmNo;

    public VeiculoAquatico(double velocidadeEmNo, String nome) {
        super(nome);
        this.velocidadeEmNo = velocidadeEmNo;
    }

    public double getVelocidadeEmNo() {
        return velocidadeEmNo;
    }

    public void setVelocidadeEmNo(double velocidadeEmNo) {
        this.velocidadeEmNo = velocidadeEmNo;
    }
    
    @Override
    public abstract void andar();
}
