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
public class Aviao extends VeiculoAereo {

    private String Marca;
    private int quantidadeDeAsas;

    public Aviao(String Marca, int quantidadeDeAsas, double velocidadeEmNo, String nome) {
        super(velocidadeEmNo, nome);
        this.Marca = Marca;
        this.quantidadeDeAsas = quantidadeDeAsas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getQuantidadeDeAsas() {
        return quantidadeDeAsas;
    }

    public void setQuantidadeDeAsas(int quantidadeDeAsas) {
        this.quantidadeDeAsas = quantidadeDeAsas;
    }

    @Override
    public void andar() {
        System.out.println("O "+this.getNome()+" andou "+ (this.getVelocidadeEmNo() * 500) + "Nó");
    }
}
