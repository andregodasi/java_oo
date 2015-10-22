/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6exercicio6andre;

/**
 *
 * @author ANDRE
 */
public class Diretor extends Funcionario{
    private String departamento[];

    public String[] getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String[] departamento) throws ExcecaoDiretor{
        if (departamento.length > 2) {
            this.departamento = departamento;
        } else {
            throw new ExcecaoDiretor();
        }
    }

    @Override
    public double getBonus(double salario) {
        return ((salario * 4) + (3000 * this.departamento.length));
    } 

    
}
