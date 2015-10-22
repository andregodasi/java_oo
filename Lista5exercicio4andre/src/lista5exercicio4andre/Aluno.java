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
public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    private int periodo;
    private String disciplinasMatriculadas[];
    private int quantidadeDisciplinasPermitidadas;

    public Aluno(String matricula, String curso, int periodo, int quantidadeDisciplinasPermitidadas, String nome, int idade) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.quantidadeDisciplinasPermitidadas = quantidadeDisciplinasPermitidadas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public int getQuantidadeDisciplinasPermitidadas() {
        return quantidadeDisciplinasPermitidadas;
    }

    public void setQuantidadeDisciplinasPermitidadas(int quantidadeDisciplinasPermitidadas) {
        this.quantidadeDisciplinasPermitidadas = quantidadeDisciplinasPermitidadas;
    }
    
     public String fazMatricula(String disciplina) {
        
        if (this.disciplinasMatriculadas.length != 0) {
            for (int i = 0; i < this.quantidadeDisciplinasPermitidadas; i++) {
                if (this.disciplinasMatriculadas[i] == null) {
                    this.disciplinasMatriculadas[i] = disciplina;
                    return "Matrícula na disciplina " + this.disciplinasMatriculadas + " executada.";
                }
                return ("Quantidade de disciplinas excedida. O limite de"
                        + "disciplinas para este aluno é de " + this.quantidadeDisciplinasPermitidadas + " disciplina(s). Se desejar, cancele a"
                        + "matrícula de uma das disciplinas e faça a nova matrícula.");
            }
        }
        return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";

    }
    
    public String cancelaMatricula(String disciplina) {
        for (int i = 0; i < this.quantidadeDisciplinasPermitidadas; i++) {
            if (this.disciplinasMatriculadas[i].equals(disciplina)) {
                this.disciplinasMatriculadas[i] = disciplina;
                return "Cancelamento da matrícula da disciplina " + disciplina + " executado com sucesso.";
            }

        }
        return "Aluno não está matriculado na disciplina LPOO, portanto não é possível cancelar esta matrícula.";
    }
    
    public void imprime(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nome do alunoe: "+ super.getNome());
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Curso: "+ this.curso);
        System.out.println("Periodo: "+ this.periodo);
        System.out.printf("Disciplinas Matriculadas: ");
        for (int i = 0; i < this.quantidadeDisciplinasPermitidadas; i++) {
            if(this.disciplinasMatriculadas[i] != null){
                System.out.printf("%d,", this.disciplinasMatriculadas[i]);
                if(i == (this.quantidadeDisciplinasPermitidadas -1)){
                    System.out.println(".");
                }
                
            }
            
        }
        System.out.println("---------------------------------------------------------------------------");
    }
}
