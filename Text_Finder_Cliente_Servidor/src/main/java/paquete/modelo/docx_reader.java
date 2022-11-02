package paquete.modelo;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;

/**
 * calse que lee documentos docx
 * @author Yonathan
 *
 */
class docx_reader {

    public static void main (String [] args) throws IOException, InvalidFormatException {

        String direccion = "C:/Users/Yonathan/Desktop/TEC/Semestre 2_2022/Datos/proyecto 2/Text_Finder_gitkraken/Text_Finder_repo1gtkraken/Text_Finder_Cliente_Servidor/src/main/resources/Files/doc 2.docx" ;

        String file = direccion;

        XWPFDocument doc = new XWPFDocument(OPCPackage.open(file));

        XWPFWordExtractor extract = new XWPFWordExtractor(doc);

        System.out.println(extract.getText());




    }
}
