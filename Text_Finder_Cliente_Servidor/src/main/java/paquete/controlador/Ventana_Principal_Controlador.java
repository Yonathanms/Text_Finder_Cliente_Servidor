package paquete.controlador;

import javafx.stage.FileChooser;

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

import java.io.File;
import java.io.IOException;


/**
 * Clase controlador de la ventana principal de la interfaz, los métodos van a representar las funciones de cada elemento
 * de la ventana
 * @author Yonathan
 */
public class Ventana_Principal_Controlador {

    /**
     * atributo que representa  un escenario
     */
    private Stage stage;

    /**
     * metodo que obtiene un escenario
     * @param primaryStage
     */
    //public void setStage(Stage primaryStage) {
        //stage = primaryStage;
   // }

    /**
     * atributo del pane de la ventana principal
     */
    @FXML
    private Pane Pane_V1;

    /**
     * atributo del ScrollBar de la ventana principal
     */
    @FXML
    private ScrollBar Scroll_V1;

    /**
     * atributo del botón de "Agregar Documento"
     */
    @FXML
    private JFXButton btn_AgregarFile;

    /**
     * Atributo del botón "Buscar Texto"
     */
    @FXML
    private JFXButton btn_BuscarFile;

    /**
     * Atributo del botón "Eliminar Documento"
     */
    @FXML
    private JFXButton btn_EliminarFile;

    /**
     * Metodo del boton de agregar archivos
     * @param event click
     */

    @FXML
    void click_btn_AgregarFile(ActionEvent event) {
        //Constantes que definen filtros de los archivos en la búsqueda de la biblioteca de Windows
        FileChooser.ExtensionFilter pdf = new FileChooser.ExtensionFilter("Archivos PDF","*.pdf");
        FileChooser.ExtensionFilter doc = new FileChooser.ExtensionFilter("Archivos Word","*.docx");
        FileChooser.ExtensionFilter txt = new FileChooser.ExtensionFilter("Archivos de Texto","*.txt");
        FileChooser.ExtensionFilter all = new FileChooser.ExtensionFilter("Todos los archivos","*.txt","*.docx","*.pdf");

        FileChooser fileChooser = new FileChooser();


        fileChooser.getExtensionFilters().addAll(pdf);
        fileChooser.getExtensionFilters().addAll(doc);
        fileChooser.getExtensionFilters().addAll(txt);
        fileChooser.getExtensionFilters().addAll(all);

        fileChooser.setTitle("Seleccionar archivo(s) o carpeta");
        fileChooser.setInitialDirectory(new File("C:"));
        File selectedFile = fileChooser.showOpenDialog(stage);

        //funcion al seleccionar file
        if (selectedFile != null) {
            System.out.println("archivo seleccionado");
            System.out.println(selectedFile.getPath());
            System.out.println(selectedFile.getName());

        }

    }


    /**
     * Metodo del boton que dirige a la ventana de Busqueda de palabras
     * @param event click
     *
     * Este método también debe realizar la indización de la biblioteca
     */
    @FXML
    void click_btn_BuscarFile(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/paquete/vista_main/Ventana_Busquedatxt.fxml"));
        Parent root = loader.load();
        VentanaBusquedatxt_Controlador controladorVbuscardoc = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Text Finder");
        //stage.initModality(Modality.APPLICATION_MODAL); //No deja interactuar con la ventana principal una vez abierta la de eliominar_File

        stage.show();

        Stage stageactual = (Stage) this.btn_BuscarFile.getScene().getWindow();
        stageactual.close();
        System.out.println("Ventana de busqueda de texto abierta");

        //this.stage.close(); //este metodo cierra el programa si cierro la ventana de elimiar archivo



    }


    @FXML
    void click_btn_EliminarFile(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/paquete/vista_main/Ventana_Eliminardoc.fxml"));
        Parent root = loader.load();
        Ventana_Eliminardoc_Controlador controladorVeliminardoc = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL); //No deja interactuar con la ventana principal una vez abierta la de eliominar_File


        stage.showAndWait();

        //this.stage.close(); //este metodo cierra el programa si cierro la ventana de elimiar archivo

    }

}
