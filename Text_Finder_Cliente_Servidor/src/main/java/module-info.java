/**
 * este modulo lo creo IntelliJ y funciona para la documentación del JavaDoc y también indica los requerimientos
 * del código
 */

module paquete.text_finder_cliente_servidor {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens paquete.vista_main to javafx.fxml;
    exports paquete.vista_main;
    exports paquete.controlador;
    opens paquete.controlador to javafx.fxml;
}