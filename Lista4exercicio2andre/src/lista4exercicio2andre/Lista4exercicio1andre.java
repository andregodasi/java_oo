/**
 *Universidade Federal do Paraná - UFPR
 *Lista 4 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
 * Escreva a estrutura de uma classe (atributos e métodos) para
 * representar um aluno (nome, matricula, curso, período,
 * disciplinasMatriculadas(array de String), idade e endereço):
 * a. Compile a classe;
 * b. Crie um construtor para essa classe com a seguinte assinatura:
 * public Aluno(String nome, String matricula, String curso, int periodo, int idade,
 * int quantidadeDisciplinasPermitidadas)
 * Onde a quantidadeDisciplinasPermitidadas representa a quantidade de
 * disciplinas que o aluno pode se matricular. Deve ser utilizada para
 * redimensionar o array de Strings.
 * c. Acrescente três métodos:
 *  String fazMatricula(String disciplina): inclui uma disciplina no array de
 * Strings. Se o aluno já ultrapassou a quantidade de disciplinas que
 * pode se matricular, então o sistema retorna para este método uma
 * string informando: “Quantidade de disciplinas excedida. O limite de
 * disciplinas para este aluno é de 2 disciplina(s). Se desejar, cancele a
 * matrícula de uma das disciplinas e faça a nova matrícula.”
 * Se o aluno não puder ser matriculado em nenhuma disciplina
 * (tamanho do array=0), então o método deve retornar: “Este aluno não
 * pode ser matriculado em nenhuma disciplina, por favor, fale com a
 * secretaria.”
 * Se foi matriculado com sucesso a seguinte String é retornada:
 * “Matrícula na disciplina “LPOO” executada.”
 *  String cancelarMatricula(String disciplina): exclui a disciplina do array
 * de Strings. Se o aluno não estiver matriculado na disciplina, o método
 * deve retornar: “Aluno não está matriculado na disciplina LPOO,
 * portanto não é possível cancelar esta matrícula.”. Se o aluno
 * realmente estiver matriculado na disciplina, então o método deve
 * retornar “Cancelamento da matrícula da disciplina LPOO executado
 * com sucesso.”
 *  String imprime(): Método que retorna uma String de forma legível com
 * todos os atributos de aluno e as disciplinas matriculadas no seguinte
 * formato:
 * -----------------------------------------------------------------
 * Nome do Aluno: Rafael Romualdo Wandresen
 * Matricula: GRR20130101
 * Curso: TADS
 * Periodo: 4
 * Disciplinas Matriculadas: Gestão de Projetos; LPOO
 * -----------------------------------------------------------------
 * d. Crie uma outra classe (SistemaAcademico) que utilize objetos do tipo
 * Aluno. Nessa classe instancie um array de Alunos que armazene os
 * alunos criados. Crie um menu com as seguintes opções: 1 – Cadastrar
 * Aluno, 2 – Excluir aluno por nome, 3 – Listar Alunos, 4 – Matricular Aluno
 * em Disciplina, 5 – Cancelar Matrícula, 6 – Imprimir lista Alunos e
 * Disciplinas Matriculadas. Cada um destes itens do menu deve ter um
 * método associado com os seguintes métodos. Criar todos os métodos
 * estáticos:
 * 1. public static void cadastrarAluno(Aluno aluno)
 * 2. public static void excluirAlunoPorNome(String nomeAluno)
 * 3. public static Aluno[] listarAlunos()
 * 4. public static String matricularAlunoEmDisciplina(Aluno aluno,
 * String disciplina). Onde o retorno informa o que ocorreu com a
 * matricula do aluno, conforme especificado no método
 * fazMatricula.
 * 5. public static String cancelarMatricula(Aluno aluno, String
 * disciplina)
 * 6. public static String imprimirListaDeAlunoseDisciplinas ()
 * e. Quando o sistema iniciar deve pedir ao usuário para informar a
 * quantidade de alunos que serão cadastrados. Com essa informação
 * dimensione o array.
 * f. Quando o usuário optar pela opção 4, se for a primeira disciplina do
 * aluno, o sistema deve perguntar em quantas disciplinas o aluno deve ser
 * matriculado. Com essa informação dimensione o array de Strings
 */
package lista4exercicio2andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista4exercicio1andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Cadastre uma pessoa. Digite endereço,nome e idade ");
     
        
        
        Pessoa p1 = new Pessoa();
        p1.setEndereco(scn.nextLine());
        p1.setNome(scn.nextLine());
        p1.setIdade(scn.nextInt());
     
        
       
        System.out.println("Nome:"+p1.getNome());
        System.out.println("Idade:"+p1.getIdade());
        System.out.println("Endereço:"+p1.getEndereco());
        
        p1.fazAniversario();
        
        p1.imprime();
        
        p1.fazAniversario();
        p1.fazAniversario();
        
        p1.imprime();
    }
    
}
