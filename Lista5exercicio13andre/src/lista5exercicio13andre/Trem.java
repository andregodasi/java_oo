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
public class Trem extends VeiculoTerrestre{
    private String marca;
    private int quantidadeDeVagoes;

    public Trem(String marca, int quantidadeDeVagoes, double velocidadeEmKm, String nome) {
        super(velocidadeEmKm, nome);
        this.marca = marca;
        this.quantidadeDeVagoes = quantidadeDeVagoes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeDeVagoes() {
        return quantidadeDeVagoes;
    }

    public void setQuantidadeDeVagoes(int quantidadeDeVagoes) {
        this.quantidadeDeVagoes = quantidadeDeVagoes;
    }

    @Override
    public void andar() {
        System.out.println("O "+this.getNome()+" andou "+ (this.getVelocidadeEmKm() * 5) + "Km");
    }
}
