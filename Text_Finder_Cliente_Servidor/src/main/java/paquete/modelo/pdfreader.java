package paquete.modelo;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

/**
 * calse que lee documentos .pdf
 * @author Yonathan
 */
public class pdfreader {

    public static void main (String [] args) throws IOException {

        String direccion_file = "C:/Users/Yonathan/Desktop/TEC/Semestre 2_2022/Datos/proyecto 2/Text_Finder_gitkraken/Text_Finder_repo1gtkraken/Text_Finder_Cliente_Servidor/src/main/resources/Files/pdf2.pdf";

        String file = direccion_file;

        PdfReader pdf = new PdfReader(file);

        // variable paginas
        int paginas = pdf.getNumberOfPages();
        //este metodo sirve para leer todas las palabras hasta la pagina final
        for(int i = 1; i <= paginas ; i++){

            String contenido = PdfTextExtractor.getTextFromPage(pdf, i);
            System.out.println(contenido);

        }

    }

}
