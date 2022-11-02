package paquete.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yonathan
 * Clase que lee documentos .txt
 */
public class txtreader {
    // metodo el cual lee el archivo que se encuentra en esa direccion nota = solo funciona con archivos.txt
    // lo ideal es encontrar una libreria capaz de leer archivos pdf y docx
    public static void main(String[] args) throws IOException {

        String contenido;
        FileReader texto = new FileReader("C:/Users/Yonathan/Desktop/TEC/Semestre 2_2022/Datos/proyecto 2/Text_Finder_gitkraken/Text_Finder_repo1gtkraken/Text_Finder_Cliente_Servidor/src/main/resources/Files/texto1.txt");

        //para leerlo
        BufferedReader buffer = new BufferedReader(texto);



        //if (texto = int){
        //metodo para while el que lee hasta que el archivo tenga lineas vacias es decir, lee hasta la ultima palabra del documento
        while ((contenido = buffer.readLine()) != null) {
            System.out.println(contenido);
        }
        buffer.close();
    }

}

