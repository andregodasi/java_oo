/*
 * 4. Modifique o sistema acadêmico criado no item 3 da lista 4 para utilizar
orientação a objetos com herança. Crie uma classe pessoa, coloque os atributos da
classe aluno que dizem respeito a pessoa nessa classe e faça uma relação de herança
entre as classes aluno e professor. Crie a classe professor (deve herdar de pessoa). No
sistema acadêmico permita criar professores e relacionar as disciplinas ministradas. Crie
uma classe que represente as disciplinas e faça o relacionamento com as classes Aluno
e Professor.
 */
package lista5exercicio4andre;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class SistemaAcademco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos que deseja matricular");
        int quantidadeDeAlunos = scn.nextInt();
        alunos = new Aluno[quantidadeDeAlunos];
        Aluno aluno = null;

        System.out.println("Digite a quantidade de professores que deseja cadastrar");
        int quantidadeDeProfessor = scn.nextInt();
        professores = new Professor[quantidadeDeProfessor];

        System.out.println("Digite a quantidade de disciplinas com descrição que deseja cadastrar");
        int quantidadeDeDisciplinas = scn.nextInt();
        disciplinas = new Disciplina[quantidadeDeDisciplinas];

        int opcao = 0;

        while (opcao != 10) {
            System.out.println("Digite a opçao que deseja");
            System.out.println("1 – Cadastrar Aluno");
            System.out.println("2 – Excluir aluno por nome");
            System.out.println("3 – Listar Alunos");
            System.out.println("4 – Matricular Aluno em Disciplina");
            System.out.println("5 – Cancelar Matrícula");
            System.out.println("6 – Imprimir lista Alunos e Disciplinas Matriculadas");
            System.out.println("7 - Cadastrar professor e suas diciplinas ministradas");
            System.out.println("8 - Cadastrar e sua descrição.");
            System.out.println("9 - Imprime relacionamento");
            System.out.println("10 - exit");
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno");
                    String nomeDoAluno = scn.next();
                    System.out.println("Digite a matriculado do aluno");
                    String matriculaDoAluno = scn.next();
                    System.out.println("Digite a curso do aluno");
                    String cursoDoAluno = scn.next();
                    System.out.println("Digite a periodo do aluno");
                    int periodoDoAluno = scn.nextInt();
                    System.out.println("Digite a idade do aluno");
                    int idadeDoAluno = scn.nextInt();
                    System.out.println("Digite a quantidade de matriculas do aluno");
                    int quantidadeDeMatriculasDoAluno = scn.nextInt();

                    aluno = new Aluno(matriculaDoAluno, cursoDoAluno, periodoDoAluno, quantidadeDeMatriculasDoAluno, nomeDoAluno, idadeDoAluno);
                    cadastraAluno(aluno);
                    break;

                case 2:
                    System.out.println("Digite o nome do aluno que deseja excluir");
                    String nomeDoAlunoExcluido = scn.next();
                    excluirAlunoPorNome(nomeDoAlunoExcluido);
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    System.out.println("Digite a disciplina");
                    String disciplinaDoAluno = scn.next();
                    String notificacaoDisciplina = matricularAlunoEmDisciplina(aluno, disciplinaDoAluno);
                    System.out.println(notificacaoDisciplina);
                    break;
                case 5:
                    System.out.println("Digite a discplina que deseja cancelar");
                    String disciplinaCancelada = scn.next();
                    notificacaoDisciplina = cancelarMatricula(aluno, disciplinaCancelada);
                    System.out.println(notificacaoDisciplina);
                    break;
                case 6:
                    String resultadoImprimirAlunoMatricula = imprimirListaDeAlunoseDisciplinas();
                    System.out.println(resultadoImprimirAlunoMatricula);
                    break;
                case 7:
                    System.out.println("Digite o nome do professor");
                    String nomeProfessor = scn.next();
                    System.out.println("Digite a quantidade disciplinas que deseja incluir nesse professor.");
                    int quantidadeDeDisciplinasDoProfessor = scn.nextInt();
                    String disciplinasDoProfessor[] = new String[quantidadeDeDisciplinasDoProfessor];
                    for (int i = 0; i < quantidadeDeDisciplinas; i++) {
                        System.out.println("Digite a disciplina do professor ministra");
                        disciplinasDoProfessor[i] = scn.next();

                    }
                    System.out.println("Digite a idade do professor.");
                    int idadeProfessor = scn.nextInt();

                    System.out.println(cadastrarProfessor(nomeProfessor, disciplinasDoProfessor, idadeProfessor));
                    break;
                case 8:
                    System.out.println("Digite o nome da disciplina.");
                    String nomeDaDisciplina = scn.next();
                    System.out.println("Digite uma descrição breve sobre a disciplina");
                    String descricaoBreve = scn.next();
                    String result = cadastraDisciplinaComDescricao(nomeDaDisciplina, descricaoBreve);
                    System.out.println(result);
                    break;
                case 9:
                    imprimeRelacionamento();
                    break;
                case 10:
                    System.out.println("Volte sempre, adoramos matricular alunos.");
                    break;
                default:
                    System.out.println("Opção escolhida não encontrada");
                    break;
            }

        }

    }

    public static Aluno alunos[];
    public static Professor professores[];
    public static Disciplina disciplinas[];

    public static void cadastraAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }

        }
    }

    public static void excluirAlunoPorNome(String nomeAluno) {
        if (alunos != null) {
            for (int i = 0; i < alunos.length; i++) {
                if (alunos[i] != null) {
                    if (alunos[i].getNome().equals(nomeAluno)) {
                        alunos[i] = null;
                    }
                }
            }
        } else {
            System.out.println("Não existem alunos matriculados ainda.");
        }
    }

    public static void listarAlunos() {
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    System.out.println(aluno.getNome());
                }

            }
            System.out.println("***********************Lista de alunos***********************");
        } else {
            System.out.println("Não existe alunos matriculados");
        }
    }

    public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina) {
        String[] disciplinas;
        if (aluno != null || aluno.getDisciplinasMatriculadas() == null || aluno.getDisciplinasMatriculadas().length != 0) {
            for (int i = 0; i < aluno.getQuantidadeDisciplinasPermitidadas(); i++) {
                if (aluno.getDisciplinasMatriculadas() == null) {
                    System.out.println("Digite a quantidade de disciplinas que deseja matricula o aluno");
                    Scanner scn = new Scanner(System.in);
                    aluno.setQuantidadeDisciplinasPermitidadas(scn.nextInt());
                    aluno.setDisciplinasMatriculadas(new String[aluno.getQuantidadeDisciplinasPermitidadas()]);
                    disciplinas = aluno.getDisciplinasMatriculadas();
                    disciplinas[i] = disciplina;
                    aluno.setDisciplinasMatriculadas(disciplinas);
                    return "Matrícula na disciplina " + disciplina + " executada.";
                }
                disciplinas = aluno.getDisciplinasMatriculadas();
                if (disciplinas[i] == null) {
                    disciplinas[i] = disciplina;
                    aluno.setDisciplinasMatriculadas(disciplinas);
                    return "Matrícula na disciplina " + disciplina + " executada.";
                }
            }
            return ("Quantidade de disciplinas excedida. O limite de"
                    + "disciplinas para este aluno é de " + aluno.getQuantidadeDisciplinasPermitidadas()
                    + " disciplina(s). Se desejar, cancele a"
                    + "matrícula de uma das disciplinas e faça a nova matrícula.");
        }
        return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";

    }

    public static String cancelarMatricula(Aluno aluno, String disciplina) {
        if (aluno.getDisciplinasMatriculadas() != null) {
            String[] disciplinas = aluno.getDisciplinasMatriculadas();
            for (int i = 0; i < aluno.getQuantidadeDisciplinasPermitidadas(); i++) {
                if (disciplinas[i].equals(disciplina)) {
                    disciplinas[i] = null;
                    aluno.setDisciplinasMatriculadas(disciplinas);
                    return disciplina + " cancelada para o aluno " + aluno.getNome();

                }

            }
            return "Disciplina não encontrada";
        }
        return "Não existe nenhuma matricula relacionado a esse aluno";
    }

    public static String imprimirListaDeAlunoseDisciplinas() {
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Nome do Aluno:" + aluno.getNome());
                    System.out.println("Matricula:" + aluno.getMatricula());
                    System.out.println("Curso:" + aluno.getCurso());
                    System.out.println("Periodo:" + aluno.getPeriodo());
                    System.out.print("Disciplinas Matriculadas:");
                    for (int i = 0; i < aluno.getQuantidadeDisciplinasPermitidadas(); i++) {
                        if (aluno.getDisciplinasMatriculadas() != null) {
                            String[] disciplinas = aluno.getDisciplinasMatriculadas();
                            if (disciplinas[i] != null) {
                                if (i == 0) {
                                    System.out.print(disciplinas[i]);
                                    continue;
                                }
                                System.out.printf(", %s", disciplinas[i]);
                            }

                        } else {
                            System.out.println("Nenhum disciplina matriculada");
                            break;
                        }
                    }
                    System.out.println(".");
                    System.out.println("-----------------------------------------------------------------");
                }
                //return "Aluno não matriculado";

            }
            return "************************Lista de Alunos matriculados************************";
        }
        return "Não existem alunos matriculados";
    }

    public static String cadastrarProfessor(String nomeProfessor, String disciplinasProfessor[], int idade) {
        if (nomeProfessor == null && disciplinasProfessor == null) {
            return "Professor e disciplinas estão vazios";
        } else if (nomeProfessor == null) {
            return "professor vazio";
        } else if (disciplinasProfessor == null) {
            return "Disciplinas vazias";
        } else {
            Professor professorPopulado = new Professor(disciplinasProfessor, nomeProfessor, idade);
            for (int i = 0; i < professores.length; i++) {
                if (professores[i] == null) {
                    professores[i] = professorPopulado;
                    break;
                }

            }
        }
        return "Professor cadastrado com sucesso";
    }

    public static String cadastraDisciplinaComDescricao(String nome, String descricao) {
        if (nome == null && descricao == null) {
            return "Nome e descrição estão vazios";
        } else if (nome == null) {
            return "Nome da disciplina está vazio";
        } else if (descricao == null) {
            return "Descrição está vazia";
        } else {
            Disciplina disciplinaDescricao = new Disciplina(nome, descricao);
            for (int i = 0; i < disciplinas.length; i++) {
                if (disciplinas[i] == null) {
                    disciplinas[i] = disciplinaDescricao;
                    break;
                }

            }
        }
        return "Disciplina cadastrada com sucesso";
    }
    
    public static void imprimeRelacionamento() {
        for (Aluno aluno : alunos) {
            for (Professor professor : professores) {
                for (Disciplina disciplina : disciplinas) {
                    for (String disciplinasMatriculada : aluno.getDisciplinasMatriculadas()) {
                        for (String disciplinasMinistradas : professor.getDisciplinasMinistradas()) {
                            if (disciplinasMatriculada.equals(disciplinasMinistradas)
                                    && disciplinasMatriculada.equals( disciplina.getNome())
                                    && disciplinasMinistradas.equals(disciplina.getNome())) {
                                System.out.println("A disciplina " + disciplina.getNome() + " é ministrada pelo professor " + professor.getNome()
                                        + " e tem o aluno " + aluno.getNome());
                            }
                        }
                    }
                }
            }
        }
    }
}
