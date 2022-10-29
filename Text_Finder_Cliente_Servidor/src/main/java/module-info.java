module paquete.text_finder_cliente_servidor {
    requires javafx.controls;
    requires javafx.fxml;


    opens paquete.text_finder_cliente_servidor to javafx.fxml;
    exports paquete.text_finder_cliente_servidor;
}