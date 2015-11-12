/*
 *Universidade Federal do Paraná - UFPR
*Lista 7 - materia de Linguagem de programação Orientada a Objetos - 4º periodo
2. (Tarefa 7) Crie uma classe que liste contatos inseridos na base dados, utilizando a
ContatoDao
a. Crie os métodos:
 public void altera(Contato contato) -> altera o contato com base nos valores
recebidos pelo id do contato
 public void remove(Contato contato) -> remove o contato com base no id
recebido do contato
b. Crie uma classe para testar os métodos.

 */
package lista7exerciciocontatoamdre;

import static java.nio.file.Files.list;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Lista7exerciciocontatoamdre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int opcao = 0;
        
        while(opcao != 6){
            System.out.println("*************Menu*************");
            System.out.println("1 - Incluir contato");
            System.out.println("2 - Alterar contato");
            System.out.println("3 - Remover contato");
            System.out.println("4 - Busca contato");
            System.out.println("5 - Listar contato");
            System.out.println("6 - Sair");
            opcao = scn.nextInt();
            
            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome e telefone do contato");
                    Contato contato = new Contato();
                    contato.setNome(scn.next());
                    contato.setTelefone(scn.nextInt());
                    ContadoDAO contatoDao = new ContadoDAO();
                    contatoDao.adiciona(contato);
                    break;
                }
                case 2: {
                    System.out.println("Digite o id e novo nome e telefone do contato");
                    Contato contato = new Contato();
                    contato.setId(scn.nextInt());
                    contato.setNome(scn.next());
                    contato.setTelefone(scn.nextInt());
                    ContadoDAO contatoDao = new ContadoDAO();
                    contatoDao.altera(contato);
                    break;
                }
                case 3: {
                    System.out.println("Digite o id do contato");
                    Contato contato = new Contato();
                    contato.setId(scn.nextInt());
                    ContadoDAO contatoDao = new ContadoDAO();
                    contatoDao.remove(contato);
                    break;
                }
                case 4: {
                    System.out.println("Digite o id do contato");
                    ContadoDAO contatoDao = new ContadoDAO();
                    int id = scn.nextInt();
                    List<Contato> contatos = contatoDao.obterContato(id);
                    for(Contato contato: contatos){
                        System.out.println("Contato:");
                        System.out.println("Id: "+ contato.getId());
                        System.out.println("Nome: "+ contato.getNome());
                        System.out.println("Telefone: "+ contato.getTelefone());
                    }
                    break;
                }
                case 5: {
                    ContadoDAO contatoDao = new ContadoDAO();
                    List<Contato> contatos = contatoDao.obterLista();
                    int numContato = 1;
                    for(Contato contato: contatos){
                        
                        System.out.println("Contato "+ numContato);
                        System.out.println("Id: "+ contato.getId());
                        System.out.println("Nome: "+ contato.getNome());
                        System.out.println("Telefone: "+ contato.getTelefone());
                        numContato ++;
                    }
                    break;
                }
                case 6:{
                break;
                }
            }
        }
    }
    
}
