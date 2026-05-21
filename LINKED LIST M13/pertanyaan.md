Jawaban Pertanyaan 2.1.2
1. Mengapa hasil compile pertama menghasilkan “Linked List Kosong”?
Karena pada awal program linked list belum memiliki node atau data sama sekali sehingga nilai head masih null. Oleh karena itu method print() menampilkan pesan "Linked List Kosong".

2. Jelaskan kegunaan variabel temp secara umum pada setiap method!
Variabel temp digunakan sebagai penunjuk sementara untuk menelusuri node pada linked list tanpa mengubah posisi head. Dengan temp, proses traversal, pencarian, penambahan, dan penghapusan data dapat dilakukan lebih aman.

awaban Pertanyaan 2.2.3
1. Mengapa digunakan keyword break pada fungsi remove?
Keyword break digunakan untuk menghentikan perulangan setelah data yang dicari berhasil dihapus sehingga program tidak terus melakukan pencarian yang tidak diperlukan.

2. Jelaskan kegunaan kode berikut pada method remove!
if (temp.next == null) {
    tail = temp;
}
Kode tersebut digunakan untuk memperbarui posisi tail apabila node yang dihapus merupakan node terakhir pada linked list.