
package beans;

import java.util.ArrayList;
import java.util.List;

public final class Autor {

    private int id;
    private String nome;
    private ArrayList<Livro> livros;

    public Autor() {
        this.livros = new ArrayList();
    }
    
    

    public Autor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList();
    }

    public Autor(String nome, ArrayList<Livro> livros) {
        this.nome = nome;
        this.livros = livros;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        if (this.getLivros().contains(livro)) {
            this.livros.remove(livro);
            livro.removerAutor(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String livrosConcatenados(){
        StringBuilder listaLivros = new StringBuilder();
        String titulo = "";
        listaLivros.append("");
        int c = 0;
        while(c < this.livros.size()){
            if(c == 0){
                listaLivros.append(this.livros.get(0).getTitulo());
            }else{
                titulo = this.livros.get(c).getTitulo();
                listaLivros.append(" ; "+titulo);
            }
            c++;
        }
        //System.out.println("---> "+listaLivros.toString());
        return listaLivros.toString();
    }
}