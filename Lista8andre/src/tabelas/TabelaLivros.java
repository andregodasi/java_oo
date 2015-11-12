
package tabelas;

import beans.Livro;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andre.silva
 */
public class TabelaLivros extends AbstractTableModel{
    private String[] colunas = new  String[] {"ID" , "Titulo" , "Autores"};
    private ArrayList<Livro> linhas;
    
    public TabelaLivros(){
        this.linhas = new ArrayList();
    }
    
    public TabelaLivros(ArrayList<Livro> lista){
        this.linhas = new ArrayList(lista);
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
        Livro livro = linhas.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return livro.getId();
            case 1:
                return livro.getTitulo();
            case 2:
                return livro.autoresConcatenados();
            default:{
                System.out.println("Erro no switch da TabelaLivros");
                throw new IndexOutOfBoundsException("Column index out of bounds");
            }
        }   
    }
    
    public void setLinhas(ArrayList<Livro> listaLivros){
        this.linhas = listaLivros;
        this.fireTableDataChanged();
    }
    
}
