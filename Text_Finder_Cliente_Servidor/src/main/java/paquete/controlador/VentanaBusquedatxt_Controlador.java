package paquete.controlador;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase que representa el controlador de la Ventana de "Busqueda de texto"
 * @author Yonathan
 */
public class VentanaBusquedatxt_Controlador {

    /**
     * atributo que representa el "botón atrás"
     */
    @FXML
    private JFXButton btn_atras_V_busquedatxt;

    /**
     * atributo que representa el botón de "ordenar por: "
     */
    @FXML
    private JFXButton btn_ordenamiento;

    /**
     * atributo que representa el botón de "Buscar frase"
     */
    @FXML
    private JFXButton btn_search_frase;

    /**
     * atributo que representa el botón de "Buscar palabras"
     */
    @FXML
    private JFXButton btn_search_palabras;

    /**
     * atributo que representa la caja de texto que muestra el número de comparaciones del AVL
     */
    @FXML
    private TextField lbl_AVL;

    /**
     * atributo que representa la caja de texto que muestra el número de comparaciones del árbol binario de búsqueda
     */
    @FXML
    private TextField lbl_Arbol_Binario_Busqueda;

    /**
     * atributo que representa la caja de texto donde va la palabra(s) o frase a buscar
     */
    @FXML
    private TextField lbl_palabra_frase;

    /**
     * atributo que representa el panel que muestra los resultados de las busquedas
     */
    @FXML
    private Pane panel_V_Busquedatxt;

    /**
     * atributo que representa el scrollbar del pane
     */
    @FXML
    private ScrollBar scrollbar_V_Busquedatxt;

    /**
     * método que realiza el botón de "atrás"
     * @param event click
     */
    @FXML
    void click_btn_atras_V_busquedatxt(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/paquete/vista_main/Ventana_Principal.fxml"));
        Parent root = loader.load();
        Ventana_Principal_Controlador controladorVprincipal = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.show();

        Stage stageactual = (Stage) this.btn_atras_V_busquedatxt.getScene().getWindow();
        stageactual.close();
        System.out.println("Ventana de busqueda de texto cerrada");

    }

    /**
     * método que realiza el botón de "ordenar por: "
     * @param event click
     */
    @FXML
    void click_btn_ordenamiento(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/paquete/vista_main/Ventana_Ordenamiento.fxml"));
        Parent root = loader.load();
        VentanaOrdenamiento_Controlador controladorVordenamiento = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL); //No deja interactuar con la ventana principal una vez abierta la de eliominar_File

        stage.showAndWait();

    }

    /**
     * método que realiza el botón de "buscar frase"
     * @param event click
     */
    @FXML
    void click_btn_search_frase(ActionEvent event) {

    }

    /**
     * método que realiza el botón de "buscar palabras"
     * @param event click
     */
    @FXML
    void click_btn_search_palabras(ActionEvent event) throws IOException {

    }

}
