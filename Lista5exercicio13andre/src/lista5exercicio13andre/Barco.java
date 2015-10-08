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
public class Barco extends VeiculoAquatico{
    private String marca;
    private int quantidadeDeHelices;

    public Barco(String marca, int quantidadeDeHelices, double velocidadeEmNo, String nome) {
        super(velocidadeEmNo, nome);
        this.marca = marca;
        this.quantidadeDeHelices = quantidadeDeHelices;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeDeHelices() {
        return quantidadeDeHelices;
    }

    public void setQuantidadeDeHelices(int quantidadeDeHelices) {
        this.quantidadeDeHelices = quantidadeDeHelices;
    }

    @Override
    public void andar() {
        System.out.println("O "+this.getNome()+" andou "+ (this.getVelocidadeEmNo() * 8.5) + "Nó");
    }
    
}
