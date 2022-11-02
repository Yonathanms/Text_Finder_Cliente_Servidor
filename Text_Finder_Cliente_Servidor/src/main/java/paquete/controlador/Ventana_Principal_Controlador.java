package paquete.controlador;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.stage.FileChooser;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Modality;
import javafx.stage.Stage;
import paquete.Estructuras_Datos.Lista_Simple;
import paquete.modelo.ArchivoView;

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

    @FXML
    private TableColumn Col_DirFile;

    @FXML
    private TableColumn Col_NameFile;

    @FXML
    private TableView <ArchivoView> TableView_Principal;

    private ObservableList <ArchivoView> lista_archivos;




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

        //Instancia la lista
        Lista_Simple list_file = new Lista_Simple();

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
            System.out.println(selectedFile.getPath());

            // Agrega el archivo a la lista simple
            //lista_archivos.Agregar_Final(selectedFile.getName());
            System.out.println(lista_archivos);

            // variables del nombre y url del archivo
            String nombrefile = selectedFile.getName();
            String direction = selectedFile.getPath();
            System.out.println(nombrefile);
            System.out.println(direction);

            //Instancia el archivo
            ArchivoView file = new ArchivoView(nombrefile, direction);

            //Agrega el archivo a la lista simple y a la interfaz
            list_file.Agregar_Final(selectedFile.getName());
            this.lista_archivos.add(file);
            this.TableView_Principal.setItems(lista_archivos);

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

    /**
     * Este método abre la ventana de eliminar archivo
     * @param event
     * @throws IOException
     */
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

    /**
     * Este método funciona para agregar elementos a la interfaz gráfica
     */
    @FXML
    void initialize() {

        lista_archivos = FXCollections.observableArrayList();

        this.Col_NameFile.setCellValueFactory(new PropertyValueFactory("nombrefile"));
        this.Col_DirFile.setCellValueFactory(new PropertyValueFactory("direction"));
    }
}
