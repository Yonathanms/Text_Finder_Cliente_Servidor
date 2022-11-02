package paquete.modelo;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * clase que representa un lector de archivos y tiene la capacidad de leer archivos .pdf , .docx y .txt
 * @author Yonathan
 */
public class Lector_Archivos {

    /**
     * atributos de las direcciones de los archivos y se clasifican
     */
    private String dir_doc;
    private String dir_pdf;
    private String dir_txt;


    /**
     * Método que lee el contenido de los archivos.docx
     * @param dir_doc
     * @return contenido de archivos docx
     * @throws InvalidFormatException no es el formato
     * @throws IOException excepción
     */
    public String  View_docx (String dir_doc) throws InvalidFormatException, IOException {

        String direccion_file = dir_doc;

        String file = direccion_file;

        XWPFDocument doc = new XWPFDocument(OPCPackage.open(file));

        XWPFWordExtractor extract = new XWPFWordExtractor(doc);

        System.out.println(extract.getText());

        return extract.getText();
    }

    /**
     * Método que permite leer el contenido de archivos .pdf
     * @param dir_pdf dirección pdf
     * @return contenido de pdf
     * @throws IOException excepción
     */
    public String View_pdf (String dir_pdf) throws IOException {

        String direccion_file = dir_pdf;

        String contenido = "";

        String file = direccion_file;

        PdfReader pdf = new PdfReader(file);

        // variable paginas
        int paginas = pdf.getNumberOfPages();

        //este metodo sirve para leer todas las palabras hasta la pagina final
        for(int i = 1; i <= paginas ; i++){

            contenido = PdfTextExtractor.getTextFromPage(pdf, i);
            System.out.println(contenido);


        }

        return contenido;
    }

    /**
     * Método que cumple la función de leer el contenido de archivos .txt
     * @param dir_txt dirección .txt
     * @return contenido del texto
     * @throws IOException excepción
     */
    public String View_txt (String dir_txt) throws IOException {

        String contenido;
        FileReader texto = new FileReader("C:/Users/Yonathan/Desktop/TEC/Semestre 2_2022/Datos/proyecto 2/Text_Finder_gitkraken/Text_Finder_repo1gtkraken/Text_Finder_Cliente_Servidor/src/main/resources/Files/texto1.txt");

        //para leerlo
        BufferedReader buffer = new BufferedReader(texto);


        //metodo para while el que lee hasta que el archivo tenga lineas vacias es decir, lee hasta la ultima palabra del documento
        while ((contenido = buffer.readLine()) != null) {
            System.out.println(contenido);
        }
        buffer.close();
        return contenido;
    }


}
