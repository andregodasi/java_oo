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
package lista7exercicio2andre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainLivroAutor {
    
    private AutorDAO autorDAO;
    private LivroDAO livroDAO;

    public MainLivroAutor() throws Exception{
        autorDAO = new AutorDAO();
        livroDAO = new LivroDAO();
    }

    public static void main(String args[]) throws Exception{
        
        MainLivroAutor main = new MainLivroAutor();
        String opcao = "";
        while (!"7".equals(opcao)) {
            try{
            System.out.println("Escolha uma das opções e tecle <ENTER>: ");
            System.out.println("  1 - Incluir Autor");
            System.out.println("  2 - Incluir Livro");
            System.out.println("  3 - Listar Autores");
            System.out.println("  4 - Listar Livro com autores");
            System.out.println("  5 - Listar Autores de um livro");
            System.out.println("  6 - Listar Livros de um autor");
            System.out.println("  7 - Sair");
            Scanner sc = new Scanner(System.in,"ISO-8859-1");
            opcao = sc.nextLine();
            switch(opcao){
                case "1":
                    main.incluirAutor();
                    break;
                case "2":
                    main.incluirLivro();
                    break;
                case "3":
                    main.listarAutores();
                    break;
                case "4":
                    main.listarLivroComAutores();
                    break;
                case "5":
                    main.listarAutoresDoLivro();
                    break;
                case "6":
                    main.listarLivrosDoAutor();
                    break;
                case "7":
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            if(opcao.equals("7")){
                break;
            }
            }catch(Exception ex){
                System.out.println("Falha na operação. Mensagem="+ ex.getMessage());
                //ex.printStackTrace();
            }
        }
    }
    public void incluirAutor() throws Exception {
        System.out.print("Digite o nome do autor:");
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String nome = sc.nextLine();
        Autor autor = new Autor(nome);
        autor = autorDAO.inserirAutor(autor);
        List<Autor> listaAutores = new ArrayList();
        listaAutores.add(autor);
        String simNao = "";
        while (!simNao.equals("n")) {
            System.out.println(" Deseja incluir um livro nesse autor S-N");

            simNao = sc.next();
            if ("S".equals(simNao)) {
                System.out.println("Digite o nome do Livro");
                String nomeLivro = sc.next();
                Livro livro = new Livro(nomeLivro, listaAutores);
                livroDAO.inserirLivro(livro);

            }
        }

    }

    public void incluirLivro() {
        System.out.print("Digite o título do livro:");
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        String titulo = sc.nextLine();
        int numAutores=1;
        List<Autor> listaAutores = new ArrayList();
        int idAutor=0;
        do{
            try{
                Scanner sc2 = new Scanner(System.in,"ISO-8859-1");
                System.out.print("ID Autor "+numAutores+":");
                idAutor = sc2.nextInt();
                if(idAutor==-1)
                    break;
                Autor autor = autorDAO.consultarAutor(idAutor);
                if(autor != null){
                    listaAutores.add(autor);
                    numAutores++;
                }else{
                    System.out.println("Autor não existe!");
                }
            }
            catch(Exception ex){
                System.out.println("ID autor não é inteiro ou inválido!");
            }
        }while(true);


        Livro livro = new Livro(titulo,listaAutores);
        livroDAO.inserirLivro(livro);
    }

    public void listarAutores() throws Exception{
        List<Autor> listaAutores = autorDAO.listarAutores();
        Collections.sort(listaAutores, new Comparator<Autor>() {
           public int compare(Autor arg0, Autor arg1) {
                return arg0.getNome().compareToIgnoreCase(arg1.getNome());
             }
        });
        System.out.println("ID\tNOME");
        for(Autor autor:listaAutores){
            System.out.println(autor.getId()+" \t"+autor.getNome());
        }
    }
    
    
    
    public void listarAutoresDoLivro() throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o id do livro");
        int idLivro = scn.nextInt();
        List<Autor> listaAutores = autorDAO.listarAutoresDoLivro(idLivro);
        
        System.out.println("ID\tNOME");
        for(Autor autor:listaAutores){
            System.out.println(autor.getId()+" \t"+autor.getNome());
        }
    }
    
    
    public void listarLivrosDoAutor() throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o id do autor");
        int idAutor = scn.nextInt();
        List<Livro> listaLivros = livroDAO.listarLivrosPorAutor(idAutor);
        Collections.sort(listaLivros, new Comparator<Livro>() {
           public int compare(Livro arg0, Livro arg1) {
               String titulo = arg0.getTitulo();
               int i = titulo.compareToIgnoreCase(arg1.getTitulo());
               return i;
             }
        });
        System.out.println("ID\tTITULO");
        for(Livro livro:listaLivros){
            System.out.println(livro.getId()+" \t"+livro.getTitulo());
        }
    }
    
    
    
    

    public void listarLivroComAutores() throws Exception{
        List<Livro> listaLivros = livroDAO.listarLivroComAutores();
        Collections.sort(listaLivros, new Comparator<Livro>() {
           public int compare(Livro arg0, Livro arg1) {
               String titulo = arg0.getTitulo();
               int i = titulo.compareToIgnoreCase(arg1.getTitulo());
               return i;
             }
        });
        System.out.println("ID\tTitulo do Livro\tAutores");
        for(Livro livro:listaLivros){
            System.out.print(livro.getId()+"\t"+livro.getTitulo()+"\t");
            for(Autor autor:livro.getAutores()){
                System.out.print(autor.getNome()+";");
            }
            System.out.print("\n");
        }

    }
}
