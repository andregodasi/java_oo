package lista_genericos;

public class Pilha<T> {
    private int tamanho;
    private Elemento primeiro;
    
    private class Elemento{
        private T item;
        private Elemento proximo;
    }    
    
    public Pilha(){
        primeiro = null;
        tamanho = 0;
    }
    public int getTamanho(){
        return tamanho;
    }
    public T getPrimeiro(){
        return primeiro.item;
    }
    
    //insere um valor na pilha
    public void empilha(T valor){
        Elemento aux = primeiro;
        primeiro = new Elemento();
        primeiro.item=valor;
        primeiro.proximo=aux;
        tamanho++;
    }

    @Override
    public String toString(){
    	Elemento aux = primeiro;
    	String retorno = "[";
    	while(aux != null){
    		retorno = retorno + aux.item + ",";
    		aux = aux.proximo;
    	}
    	return retorno.substring(0, retorno.length()-1) + "]";
    }

    //metodo retira o ultimo elemento que foi inserido
    public void desempilha() {
    	primeiro = primeiro.proximo;
    	tamanho--;
    }
}
