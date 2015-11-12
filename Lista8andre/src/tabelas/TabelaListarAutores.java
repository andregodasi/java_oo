
package tabelas;

import beans.Autor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andre.silva
 */
public class TabelaListarAutores extends AbstractTableModel{
    private String[] colunas = new String[] {"ID" , "Autor" ,"Livros"};
    private ArrayList<Autor> linhas;

    public TabelaListarAutores() {
        this.linhas = new ArrayList();
    }
    
    
    
    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }
    
    @Override
    public String getColumnName(int index){
        return this.colunas[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autor autor = this.linhas.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return autor.getId();
            case 1: 
                return autor.getNome();
            case 2:
                return autor.livrosConcatenados();
            default:{
                System.out.println("Erro no switch da TabelaLivros");
                throw new IndexOutOfBoundsException("Column index out of bounds");
            }
        }
    }
    
    public void setLinhas(ArrayList<Autor> listaAutor ){
        this.linhas = listaAutor;
        this.fireTableDataChanged();
    }
}
