
public class Searching<T> {

    public static <T> int linearSearch(T[] ar, T obj) {
        int found = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals(obj)) {
                System.out.println(obj + " Found at Index :" + i);
                found++;
                return i;
            }
        }
        if (found == 0) {
            System.out.println(obj + " Not Found!");
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] ar, T obj) {
        int low = 0;
        int high = ar.length - 1;
        int found = 0;
        while (low <= high) {
            int mid = (low + high) / 2;

            int result = ar[mid].compareTo(obj);
            if (result == 0) {
                System.out.println(obj + " Found at :" + mid);
                return mid;
            } else if (result > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        if (found == 0) {
            System.out.println(obj + " Not Found");
        }
        return -1;
    }

}
