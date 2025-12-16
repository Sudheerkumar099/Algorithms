public class Main {
    public static void main(String[] args) {
        Integer [] ar= {9,8,1,9,8,9,7,6,8,5,6,4,2,4,6,7};
        Sorting.insertionSort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}