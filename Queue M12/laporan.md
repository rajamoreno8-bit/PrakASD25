Jawaban Pertanyaan
1. Mengapa front dan rear bernilai -1 sedangkan size = 0?
Karena queue masih kosong.
Nilai -1 menandakan belum ada indeks yang dipakai.
size = 0 karena belum ada data di dalam queue.

2. Maksud potongan kode pada Enqueue
if (rear == max - 1) {
    rear = 0;
} else {
    rear++;
}
Digunakan untuk circular queue.
Jika rear sudah di indeks terakhir array, maka kembali ke indeks 0.
Jika belum, rear bertambah 1.

3. Maksud potongan kode pada Dequeue
if (front == max - 1) {
    front = 0;
} else {
    front++;
}
Digunakan agar front bergerak maju.
Jika front sudah di indeks terakhir, kembali ke 0.
Jika belum, front bertambah 1.

4. Mengapa perulangan print dimulai dari front?
Karena data queue dimulai dari posisi front, bukan selalu dari indeks 0.

5. Maksud kode berikut
i = (i + 1) % max;
Digunakan untuk circular queue agar indeks kembali ke awal array ketika mencapai indeks terakhir.

6. Potongan kode queue overflow
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}

7. Modifikasi agar program berhenti saat overflow/underflow
Sudah dilakukan dengan:
System.exit(0);