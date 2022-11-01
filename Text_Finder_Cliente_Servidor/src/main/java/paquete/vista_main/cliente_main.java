package paquete.vista_main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import paquete.controlador.Ventana_Principal_Controlador;

import java.io.IOException;

/**
 * Es la clase del cliente servidor y este cumple la tarea de abrir el primer escenario y además se comunica con el
 * servidor
 * @author Yonathan
 * @version 1.1, java version 1.18 azul y SceneBuilder 2.0.
 */
public class cliente_main extends Application {

    /**
     * Este metodo fue creado por el JavaFx e inicializa el escenario1
     * @param stage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws IOException si algo falla con el primer escenario al iniciar la clase "cliente_main" manda un error
     * a la consola
     */
    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/paquete/vista_main/Ventana_Principal.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Text_Finder");
        Ventana_Principal_Controlador controller = loader.getController();

        //controller.setStage(primaryStage);
        primaryStage.show();

    }

    /**
     * En este metodo se debe colocar la lógica que necesita el "cliente_main" para lograr conectar con el servidor
     * @param args argumentos
     */
    public static void main(String[] args) {
        launch();
    }
}