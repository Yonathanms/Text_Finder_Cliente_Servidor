package paquete.Estructuras_Datos;

/**
 * Clase que representa el constructor de la lista
 * @author Yonathan
 */
public class Lista_Simple {

    /**
     * variables
     */
    private Nodo inicio;
    private int size;

    /**
     * si el inicio de la lista es vacio, si el tamaño de la lista es igual a cero
     */
    public void Lista () {

        inicio = null;
        size = 0;

    }

    /**
     * Metodo que indica si la lista esta vacia
     * @return booleano true
     */
    public boolean ListaVacía() {
        return inicio == null;
    }

    /**
     * Método que agrega un nuevo elemento al final de la lista
     * @param valor elemento
     */
    public void Agregar_Final (String valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (ListaVacía()){
            inicio = nuevo;
        }
        else {
            Nodo aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        size++;
    }

    /**
     * Método que agrega un valor al inicio de la lista
     * @param valor elemento
     */
    public void Agregar_Inicio (String valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (ListaVacía()){
            inicio = nuevo;
        }
        else {

            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
        size++;
    }


    /**
     * Función que busca un elemento de la lista
     * @param referencia elemento a buscar
     * @return True or False
     */
    public boolean buscar(String referencia){

        Nodo aux = inicio;
        boolean encontrado = false;

        while ((aux != null && encontrado != true)) {
            if (referencia == aux.getValor()) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * Método que elimina el valor que sea igual a la referencia
     * @param referencia elemento a eliminar
     */
    public void Eliminar_Elemento (String referencia) {
        if (buscar(referencia)) {

            if(inicio.getValor() == referencia) {

                inicio = inicio.getSiguiente();

            }
            else {

                Nodo aux = inicio ;

                while (aux.getSiguiente().getValor() != referencia){

                    aux = aux.getSiguiente();

                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();

                aux.setSiguiente(siguiente);

            }

            size--;
        }
    }

}





