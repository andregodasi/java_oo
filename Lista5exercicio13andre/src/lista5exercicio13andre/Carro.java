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
public class Carro extends VeiculoTerrestre{
    private String marca;
    private int quantidadeDeRodas;

    public Carro(String marca, int quantidadeDeRodas, double velocidadeEmKm, String nome) {
        super(velocidadeEmKm, nome);
        this.marca = marca;
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    @Override
    public void andar() {
        System.out.println("O "+this.getNome()+" andou "+ (this.getVelocidadeEmKm() * 10) + "Km");
    }
    
}
