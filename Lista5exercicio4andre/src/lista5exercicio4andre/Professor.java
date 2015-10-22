/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5exercicio4andre;

/**
 *
 * @author ANDRE
 */
public class Professor extends Pessoa{
   private String disciplinasMinistradas[];

    public Professor(String[] disciplinasMinistradas, String nome, int idade) {
        super(nome, idade);
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public String[] getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(String[] disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }
    
}
