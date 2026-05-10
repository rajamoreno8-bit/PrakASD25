
2.2.3
1. Bagian yang diperbaiki:
Method push()
Method pop()
Method peek()
Penambahan pengecekan isFull() dan isEmpty()

2. Jumlah data yang dapat ditampung = 5 data.
Potongan kode:
StackTugasMahasiswa stack = new StackTugasMahasiswa(5);

3. Agar stack tidak melebihi kapasitas array.
Jika dihapus:
Program bisa error
Terjadi ArrayIndexOutOfBoundsException

4. Sudah dimodifikasi menggunakan method:
Mahasiswa lihatBawah()

5. Sudah ditambahkan method:
int jumlahTugas()

 2.2.3
1. Alur kerja konversiDesimalKeBiner():
Nilai desimal dibagi 2
Sisa pembagian dimasukkan ke stack
Setelah selesai, data dikeluarkan dari stack
Hasil keluarnya menjadi angka biner

2. Jika:
while (kode != 0)
Hasilnya tetap benar. Karena perulangan akan berhenti saat nilai kode menjadi 0.