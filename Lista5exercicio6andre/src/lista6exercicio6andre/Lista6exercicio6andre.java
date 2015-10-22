/*
 *Universidade Federal do Paraná - UFPR
*Lista 6 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
6. (Tarefa 6) Retome o exercício 3 da Semana 05. Crie uma exceção especializada e
monitorada para as classes Gerente e Diretor. No caso da classe Gerente essa exceção
deve ser lançada no construtor e no método set caso o array de funcionários tenha um
tamanho menor do que 5. No caso do Diretor o array de departamentos não pode ser
menor do que 2. Ou seja, a regra de negócios diz que um Gerente não pode ter uma
equipe menor do que 5 pessoas e um diretor deve dirigir no mínimo 2 departamentos.
Faça uma classe que teste essas opções e informe ao usuário essas condições.
 */
package lista6exercicio6andre;

/**
 *
 * @author ANDRE
 */
public class Lista6exercicio6andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{
        Diretor diretor = new Diretor();
        diretor.setNome("nomeDiretor");
        diretor.setSalario(100000);
        String dep[] = {"TI","Programação","Suporte","Help Desk","Negocio"};
        diretor.setDepartamento(dep);
        
        Gerente gerente = new Gerente();
        gerente.setNome("nomeGerente");
        gerente.setSalario(10000);
        String fun[] = {"andre","hugo","abreu","justin"};
        gerente.setFuncionario(fun);
       
        Analista analista = new Analista();
        analista.setNome("analista");
        analista.setSalario(1000);
        
        Programador programador = new Programador();
        programador.setNome("programador");
        programador.setSalario(100);
        
        
        AuxLimpeza auxLimpeza = new AuxLimpeza();
        auxLimpeza.setNome("auxLimpeza");
        auxLimpeza.setSalario(10);
        
        
        Funcionario funcionarios[] = new Funcionario[5];
        funcionarios[0] = diretor;
        funcionarios[1] = gerente;
        funcionarios[2] = analista;
        funcionarios[3] = programador;
        funcionarios[4] = auxLimpeza;
        
        imprimeRelatorio(funcionarios);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
     public static void imprimeRelatorio(Funcionario[] listaFuncionarios){
         
         for(Funcionario funcionario:listaFuncionarios){
             System.out.println("Nome: "+ funcionario.getNome());
             System.out.println("Salario: "+ funcionario.getSalario());
             System.out.println("Bônus: "+ funcionario.getBonus(funcionario.getSalario()));
             System.out.println();
         }
    }
    
}
