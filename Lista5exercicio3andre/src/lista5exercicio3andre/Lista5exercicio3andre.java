/*
 *Universidade Federal do Paraná - UFPR
 *Lista 5 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
3 - Crie e implemente uma hierarquia de classes para a classe Funcionario.
Imagine que Funcionario represente uma classe em um sistema de uma Empresa. Crie
classes para herdar de funcionário (Gerente, Diretor e Analista). O gerente deve conter
um array de Funcionarios e o Diretor deve conter um array de Departamentos.
Implemente um método abstrado na classe Funcionario chamado getBonus. O cálculo do
bônus anual segue as seguintes regras. Implemente estas regras utilizando conceitos de polimorfismo:
a. Para Diretor: 4 salários + R$3000,00 por departamento gerenciado
b. Para Gerente: 2 salários + R$100,00 por pessoa gerenciada
c. Analista: 1 salário
d. Programador: 0,8 salário
e. Auxiliar de Limpeza: 0,5 salário
Crie uma classe chamada SistemaRH que instancie os objetos e imprima um relatório
com os funcionários da empresa. A classe SistemaRH deve ter um método estático para
imprimir o relatório: public static void imprimeRelatorio(Funcionario[] listaFuncionarios)

 */
package lista5exercicio3andre;

/**
 *
 * @author ANDRE
 */
public class Lista5exercicio3andre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
