public class Sorting {

    public static <T extends Comparable<T>> void bubbleSort(T[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
                if (ar[j].compareTo(ar[j + 1]) > 0) {
                    T temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j].compareTo(ar[min]) < 0) {
                    min = j;
                }
            }
            T temp = ar[min];
            ar[min] = ar[i];
            ar[i] = temp;
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] ar) {
        for (int i = 1; i < ar.length; i++) {
            T temp = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j].compareTo(temp) > 0) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = temp;
        }
    }


    //just Tried Not working for duplicates
    public static <T extends Comparable<T>> void Sort(T[] ar) {
        for (int j = 0; j < ar.length - 1; j++) {
            if (ar[j].compareTo(ar[j + 1]) > 0) {
                T temp = ar[j];
                ar[j] = ar[j + 1];
                ar[j + 1] = temp;
            }
        }


    }


}


