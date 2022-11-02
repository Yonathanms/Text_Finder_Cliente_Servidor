package paquete.Estructuras_Datos;

/**
 * Esta clase es un constructor del nodo que se utilizara para la lista simple
 * @author Yonathan
 */
public class Nodo {
    /**
     * variables. Valor es lo que está dentro del nodo. siguiente represena el puntero.
     */
    private String valor;
    private Nodo siguiente;

    public void Nodo () {
        this.valor = "";
        this.siguiente = null;
    }

    /**
     * get que obtiene el valor del nodo
     * @return contenido del nodo
     */
    public String getValor() {
        return valor;
    }

    /**
     * Envía lo que contiene el nodo
     * @param valor contenido del nodo
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * obtiene el puntero
     * @return siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Envía el puntero
     * @param siguiente puntero
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

