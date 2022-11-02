/**
 * este modulo lo creó IntelliJ y funciona para la documentación del JavaDoc y también indica los requerimientos
 * del código
 */

module paquete.text_finder_cliente_servidor {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires fr.opensagres.poi.xwpf.converter.core;
    requires org.apache.poi.ooxml;
    requires itextpdf;

    opens  paquete.controlador to javafx.fxml;
    opens paquete.vista_main to javafx.fxml;
    exports paquete.vista_main;
    exports paquete.controlador;
    exports paquete.modelo;
}