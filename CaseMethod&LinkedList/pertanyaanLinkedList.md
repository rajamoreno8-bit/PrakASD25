Jawaban Pertanyaan 12.2.3
1. Single Linked List hanya punya pointer next, traversal hanya maju. Double Linked List punya next dan prev, traversal bisa maju dan mundur.

2. next menunjuk node setelahnya, prev menunjuk node sebelumnya.

3. Konstruktor digunakan untuk menginisialisasi linked list kosong dengan head = null dan tail = null.

4. Karena saat linked list kosong dan ditambah 1 node, node tersebut menjadi node pertama sekaligus terakhir.

5. Sudah dimodifikasi pada method print():
if (isEmpty()) {
    System.out.println("Linked List masih kosong");
}

6. Sudah ditambahkan method printReverse().

Jawaban Pertanyaan 12.3.3
1. head = head.next;
Digunakan memindahkan head ke node berikutnya.

2. head.prev = null;
Digunakan memutus hubungan node lama dengan head baru.
Sudah dimodifikasi pada removeFirst() dan removeLast() untuk menampilkan data yang dihapus.