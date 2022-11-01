package paquete.controlador;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Clase del controlador de la Ventana "Eliminar doc"
 * @author Yonathan
 */
public class Ventana_Eliminardoc_Controlador {

   // private Ventana_Principal_Controlador controladorVprincipal;
    //private Stage stage;




    /**
     * atributo del botón "atrás"
     */
    @FXML
    private JFXButton btn_atras;

    /**
     * atributo del botón "eliminar"
     */
    @FXML
    private JFXButton btn_delete;

    /**
     * atributo de la caja de texto "Nombre del archivo"
     */
    @FXML
    private TextField lbl_NameFileDelete;
    private paquete.controlador.Ventana_Principal_Controlador Ventana_Principal_Controlador;


    /**
     * Método del botón "atrás"
     * @param event click
     */
    @FXML
    void click_btn_atras(ActionEvent event) {
        //stage.close();

        Stage stageactual = (Stage) this.btn_atras.getScene().getWindow();
        stageactual.close();
        System.out.println("Ventana cerrada");
    }


    /**
     * Método del botón de "Eliminar"
     * @param event click
     */
    @FXML
    void click_btn_delete(ActionEvent event) {

        Stage stageactual = (Stage) this.btn_delete.getScene().getWindow();
        stageactual.close();
        System.out.println("Ventana cerrada y actualización de lista");


    }

}






