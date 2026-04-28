public class SortingMain {
    public static void main(String[] args) {
        int a[] = {7, 3, 9, 2, 5};

        Sorting s = new Sorting(a, a.length);

        System.out.print("Data awal: ");
        s.tampil();

        s.bubbleSort();
        System.out.print("Bubble Sort: ");
        s.tampil();

        s.selectionSort();
        System.out.print("Selection Sort: ");
        s.tampil();

        s.insertionSort();
        System.out.print("Insertion Sort: ");
        s.tampil();
    }
}