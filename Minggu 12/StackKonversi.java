public class StackKonversi {
    int[] data;
    int top;

    StackKonversi() {
        data = new int[32];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == data.length - 1;
    }

    void push(int nilai) {
        if (!isFull()) {
            top++;
            data[top] = nilai;
        }
    }

    int pop() {
        if (!isEmpty()) {
            int hasil = data[top];
            top--;
            return hasil;
        } else {
            return -1;
        }
    }
}