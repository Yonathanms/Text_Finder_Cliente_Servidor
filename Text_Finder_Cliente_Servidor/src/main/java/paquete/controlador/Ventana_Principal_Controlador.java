package paquete.controlador;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;


/**
 * Clase controlador de la ventana principal de la interfaz, los métodos van a representar las funciones de cada elemento
 * de la ventana
 * @author Yonathan
 */
public class Ventana_Principal_Controlador {

    /**
     * método del pane de la ventana principal
     *
     */
    @FXML
    private Pane Pane_V1;

    /**
     * Método del scrollbar de la ventana principal
     */
    @FXML
    private ScrollBar Scroll_V1;

    /**
     * Método del botón "Buscar Texto de la ventana principal
     */
    @FXML
    private JFXButton btn_AgregarFile;

    /**
     * Método del botón "Agregar Documento"
     */
    @FXML
    private JFXButton btn_BuscarFile;

    /**
     * Método del botón "Eliminar Documento"
     */
    @FXML
    private JFXButton btn_EliminarFile;

    /**
     * Método...
     */
    @FXML
    void initialize() {

    }

}
