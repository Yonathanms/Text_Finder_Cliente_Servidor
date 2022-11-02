package paquete.Algoritmos_Ordenamiento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * clase que hace el algoritmo de ordenamiento en fechas
 * @author Jason
 */
public class BubbleSort {

    static BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in)); // Este es el lector
    static Calendar c = Calendar.getInstance();// instancia de la clase Calendar
    static SimpleDateFormat Format = new SimpleDateFormat("MM/dd/yy");// El formato de la fecha
    static String Fecha[] = new String[5]; // Arreglo de tipo string con dimension §
    static Date Dates[] = new Date[5]; // Arreglo de tipo fecha con dimension 5

    public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
        AddDates();
        System.out.println("Fechas en desorden ");
        ShowArray();

        bubbleSort(Dates, 5);
        System.out.println("Fechas en Orden");
        ShowArray();
    }

    static public void AddDates() throws NumberFormatException, IOException, ParseException {
        for (int i = 0; i < 5; i++) {
            System.out.print("Fecha del archivo" + (i + 1) + "MM/dd/yy:");
            String Date = Reader.readLine();
            c.setTime(Format.parse(Date));
            String formattedDate = Format.format(c.getTime());
            Dates[i] = c.getTime();
            Fecha[i] = formattedDate;
        }
    }

    public static void ShowArray() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Fecha" + (i + 1) + ":()" + Fecha[i]);

        }

    }

    static void bubbleSort(Date arr[], int n) {

        int i, j;
        Date temp;
        String temp2;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    temp2 = Fecha[j];
                    arr[j] = arr[j + 1];//
                    Fecha[j] = Fecha[j + 1];
                    arr[j + 1] = temp;
                    Fecha[j + 1] = temp2;
                    swapped = true;


                }
            }
            if (swapped == false)
                break;
        }
    }


}
