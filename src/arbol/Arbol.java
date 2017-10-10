package arbol;

/**
 *
 * @author Burciaga_LP
 */
public class Arbol {
    private Nodo raiz;
    
    public Arbol(int valor)
    {
        this.raiz = new Nodo(valor);
    }
    
    public Arbol(Nodo raiz)
    {
        this.raiz = raiz;
    }
    
    public Nodo getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
