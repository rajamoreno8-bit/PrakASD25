class Sorting {
    int data[];
    int jmlData;

    Sorting(int data[], int jmlData) {
        this.data = data;
        this.jmlData = jmlData;
    }

    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    
    void bubbleSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            for (int j = 0; j < jmlData - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    
    void selectionSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jmlData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    
    void insertionSort() {
        for (int i = 1; i < jmlData; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
}