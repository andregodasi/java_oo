/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4exercicio2andre;

/**
 *
 * @author ANDRE
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int fazAniversario(){
        return this.idade += 1;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.endereco);
        
    }
}
