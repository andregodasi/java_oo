
package tabelas;

import beans.Livro;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andre.silva
 */
public class TabelaLivrosDeAutor  extends AbstractTableModel{
    private String[] colunas = new String[] {"ID" , "Titulo"};
    private ArrayList<Livro> linhas;

    public TabelaLivrosDeAutor() {
        this.linhas = new ArrayList();
    }
    
    public TabelaLivrosDeAutor(ArrayList<Livro> listaLivros){
        this.linhas = new ArrayList(listaLivros);
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
        Livro livro = this.linhas.get(rowIndex);
        switch(columnIndex){
            case 0:
                return livro.getId();
            case 1:
                return livro.getTitulo();
            default:{
                System.out.println("Erro no switch da TabelaLivrosDeAutor");
                throw new IndexOutOfBoundsException("Column index out of bounds");
            }
        }
    }
    
    public void setLinhas(ArrayList<Livro> listaLivros){
        this.linhas = listaLivros;
        this.fireTableDataChanged();
    }
    
}
