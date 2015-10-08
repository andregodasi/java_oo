/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5exercicio3andre;

/**
 *
 * @author ANDRE
 */
public class Gerente extends Funcionario{
    private String funcionario[];

    public String[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String[] funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public double getBonus(double salario) {
        return ((salario * 2) + (100 * this.funcionario.length) );
    }
    
    
}
