package paquete.controlador;

import paquete.vista_main.*;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Clase controlador de la ventana principal de la interfaz, los métodos van a representar las funciones de cada elemento
 * de la ventana
 *
 * @author Yonathan
 */
public class Ventana_Principal_Controlador {


    private Stage stage;
    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    /**
     * método del pane de la ventana principal
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
     * Metodo del boton de agregar archivos
     * @param event click
     */
    @FXML
    void click_btn_AgregarFile(ActionEvent event) {


    }


    /**
     * Metodo del boton que dirige a la ventana de Busqueda de palabras
     * @param event
     */
    @FXML
    void click_btn_BuscarFile(ActionEvent event) {


    }


    @FXML
    void click_btn_EliminarFile(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/paquete/vista_main/Ventana_Eliminardoc.fxml"));

        Parent root = loader.load();

        Ventana_Eliminardoc_Controlador controller = loader.getController();

        Scene scene = new Scene(root);

        Stage stage = new Stage();

        stage.setScene(scene);

        controller.init(stage , this);

        /**
         * Este metodo funciona para que la ventana principal no se cierre a la hora de mostrar la ventana de eliminar
         * archivos
         */
        stage.showAndWait();

        ///this.stage.close(); este metodo cierra el programa si cierro la ventana de elimiar archivo

    }


    /**
     * Método...
     */
    @FXML
    void initialize() {

    }

}
