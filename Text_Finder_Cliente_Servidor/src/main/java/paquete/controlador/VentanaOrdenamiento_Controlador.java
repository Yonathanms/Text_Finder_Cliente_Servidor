package paquete.controlador;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * clase que representa el controlador de la ventana de las opciones de ordenamiento de las búsquedas
 * @author Yonathan
 */
public class VentanaOrdenamiento_Controlador {

    /**
     * atributo que representa el botón de "Ordenar"
     */
    @FXML
    private JFXButton btn_ordenar;

    /**
     * atributo que representa el radio botón de "Fecha de Creación"
     */
    @FXML
    private JFXRadioButton rad_button_fecha;

    /**
     *atributo que representa el radio botón de "Nombre del Archivo"
     */
    @FXML
    private JFXRadioButton rad_button_nombrefile;

    /**
     * atributo que representa el radio botón de "Tamaño (Cantidad de palabras)"
     */
    @FXML
    private JFXRadioButton rad_button_tamaño;

    /**
     * método que realiza el botón de "ordenar"
     * @param event click
     */
    @FXML
    void click_btn_ordenar(ActionEvent event) {

        Stage stageactual = (Stage) this.btn_ordenar.getScene().getWindow();
        stageactual.close();
        System.out.println("Ventana de ordenamiento cerrada");
    }



    /**
     * método que solo limita a seleccionar un radio botón a la vez
     */
    @FXML
    void initialize() {

        ToggleGroup tg = new ToggleGroup();
        this.rad_button_fecha.setToggleGroup(tg);
        this.rad_button_nombrefile.setToggleGroup(tg);
        this.rad_button_tamaño.setToggleGroup(tg);

    }

}
