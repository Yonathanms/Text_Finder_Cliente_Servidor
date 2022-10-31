package paquete.vista_main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(cliente_main.class.getResource("Ventana_Busquedatxt.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Text_Finder");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * En este metodo se debe colocar la lógica que necesita el "cliente_main" para lograr conectar con el servidor
     * @param args argumentos
     */
    public static void main(String[] args) {
        launch();
    }
}