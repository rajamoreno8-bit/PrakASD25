Jawaban Pertanyaan 2.1.3
1. Bagian yang perlu diperbaiki?
Bagian method push() dan pop() agar sesuai konsep Stack (LIFO), serta penambahan pengecekan isFull() dan isEmpty().

2. Berapa kapasitas Stack?
Kapasitas Stack adalah 5 data mahasiswa.
Potongan kode:
StackTugasMahasiswa stack = new StackTugasMahasiswa(5);

3. Mengapa perlu !isFull()?
Agar data tidak melebihi kapasitas array.
Jika dihapus:
program bisa error
terjadi ArrayIndexOutOfBoundsException

4. Operasi melihat tugas terbawah
Method:
Mahasiswa lihatBawah() {
    return stack[0];
}
5. Method menghitung jumlah tugas
int jumlahTugas() {
    return top + 1;
}

F. Jawaban Pertanyaan 2.2.3
1. Alur method konversiDesimalKeBiner()
Nilai dibagi 2
Sisa pembagian dimasukkan ke stack
Dilakukan terus sampai nilai 0
Isi stack dikeluarkan kembali
Hasil keluaran menjadi bilangan biner

Contoh:

10 / 2 = 5 sisa 0
5 / 2 = 2 sisa 1
2 / 2 = 1 sisa 0
1 / 2 = 0 sisa 1

Hasil biner = 1010
2. Jika while(kode != 0)?
Hasilnya tetap benar.
Karena:
perulangan berhenti saat nilai sudah 0
sama seperti kondisi while(kode > 0)
Tetapi while(kode > 0) lebih aman karena tidak memproses angka negatif.