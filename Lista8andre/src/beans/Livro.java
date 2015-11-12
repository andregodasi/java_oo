
package beans;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Livro {

    private int id;
    private String titulo;
    private ArrayList<Autor> autores;

    public Livro() {
        this.autores = new ArrayList();
    }
    
    public Livro(String titulo){
        this.titulo = titulo;
        this.autores = new ArrayList();
    }
    
    public Livro(String titulo,ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.autores = new ArrayList(autores);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    
    /*public void setAutores(List<Autor> autores) {
        Iterator iterator = autores.iterator();
        while (iterator.hasNext()) {
            Autor autor = (Autor) iterator.next();
            this.adicionarAutor(autor);
        }
    }*/

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public void adicionarAutor(Autor autor) {
        //this.autores.add(autor);
        if (!this.getAutores().contains(autor)) {
            this.autores.add(autor);
            autor.adicionarLivro(this);
        }
    }

    public void removerAutor(Autor autor) {
        if (!this.getAutores().contains(autor)) {
            this.autores.remove(autor);
            autor.removerLivro(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String autoresConcatenados(){
        StringBuilder autores = new StringBuilder();
        String  nome = "";
        int c = 0;
        autores.append("");
        while(c < this.autores.size()){
            if(c == 0){
                autores.append(this.autores.get(c).getNome());
            }else{
            nome = this.autores.get(c).getNome();
            autores.append(" ; "+nome);
            }
            c++;
        }
        return autores.toString();
    }
    
}
