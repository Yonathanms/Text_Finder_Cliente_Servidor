package paquete.Algoritmos_Ordenamiento;

import java.util.Arrays;

/**
 * Clase para ordenar los archivoa alfabeticamente
 *
 * @author Jason
 */
public class QuickSort {

    public static void main(String args[]) {
        // unsorted integer array
        String[] unsorted = {"b", "c", "a", "d", "v"};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        QuickSortName algorithm = new QuickSortName();

        // sorting integer array using quicksort algorithm
        algorithm.sort(unsorted);

        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));
    }
}

class QuickSortName {

    private String input[];
    private int length;

    public void sort(String[] names) {

        if (names == null || names.length == 0) {
            return;
        }

        this.input = names;
        length = names.length;
        quickSort(0, length - 1);
    }


    private void quickSort(int low, int high) {
        int i = low;
        int j = high;


        String pivot = input[low + (high - low) / 2];


        while (i <= j) {

            while (input[i].charAt(0) < pivot.charAt(0)) {
                i++;
            }
            while (input[j].charAt(0) > pivot.charAt(0)) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }


        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        String temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
