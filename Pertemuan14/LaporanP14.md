14.2.2 Pertanyaan Percobaan
1. Mengapa dalam Binary Search Tree proses pencarian data bisa lebih efektif dilakukan dibanding Binary Tree biasa?
Karena pada Binary Search Tree (BST) terdapat aturan bahwa nilai pada subtree kiri lebih kecil daripada root dan nilai pada subtree kanan lebih besar daripada root. Dengan aturan tersebut, proses pencarian hanya perlu menelusuri satu cabang pada setiap langkah sehingga lebih cepat dibanding Binary Tree biasa yang mungkin harus memeriksa seluruh node.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
Atribut left digunakan untuk menyimpan referensi ke anak kiri suatu node, sedangkan atribut right digunakan untuk menyimpan referensi ke anak kanan suatu node. Kedua atribut tersebut digunakan untuk membentuk struktur pohon biner.

3a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
Atribut root berfungsi sebagai node akar atau titik awal dari Binary Tree. Semua operasi seperti penambahan, pencarian, traversal, dan penghapusan node selalu dimulai dari root.

3b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
Nilai root adalah null karena tree masih kosong dan belum memiliki node.

4. Ketika tree masih kosong dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
Node baru akan langsung dijadikan sebagai root karena belum ada node lain di dalam tree.

5. Perhatikan method add(), di dalamnya terdapat baris program tersebut. Jelaskan secara detail kegunaannya.
Baris program tersebut digunakan untuk menentukan posisi penempatan node baru berdasarkan nilai IPK. Jika IPK yang akan dimasukkan lebih kecil dari node saat ini maka pencarian posisi dilanjutkan ke subtree kiri. Jika posisi kiri masih kosong maka node baru ditempatkan di sana. Jika tidak kosong maka proses dilanjutkan ke node kiri berikutnya hingga ditemukan posisi yang sesuai.

6. Jelaskan langkah-langkah pada method delete() saat menghapus node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?
Langkah-langkahnya:
Mencari node yang akan dihapus.
Karena node memiliki dua anak, node tidak dapat langsung dihapus.
Method getSuccessor() mencari node pengganti (successor), yaitu node dengan nilai terkecil pada subtree kanan.
Successor dipindahkan ke posisi node yang dihapus.
Anak kiri dan anak kanan dari node yang dihapus disesuaikan sehingga struktur BST tetap valid.
Node lama kemudian dihapus.
Method getSuccessor() membantu menemukan node yang paling tepat untuk menggantikan node yang dihapus tanpa melanggar aturan Binary Search Tree.

14.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
data digunakan untuk menyimpan seluruh node Binary Tree dalam bentuk array.
idxLast digunakan untuk menyimpan indeks terakhir yang berisi data sehingga program mengetahui batas data yang valid.

2. Apakah kegunaan dari method populateData()?
Method populateData() digunakan untuk mengisi array Binary Tree dengan data yang telah dibuat serta mengatur nilai idxLast.

3. Apakah kegunaan dari method traverseInOrder()?
Method traverseInOrder() digunakan untuk menampilkan isi tree dengan urutan traversal InOrder, yaitu:
Left Child → Root → Right Child
Pada BST traversal ini akan menghasilkan data yang terurut dari kecil ke besar.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?
Rumus:
Left Child = 2 × i + 1
Right Child = 2 × i + 2
Jika i = 2:
Left Child = (2 × 2) + 1 = 5
Right Child = (2 × 2) + 2 = 6
Jadi:
Left Child berada pada indeks 5
Right Child berada pada indeks 6

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
Statement tersebut menunjukkan bahwa indeks terakhir yang berisi data adalah indeks ke-6. Artinya data valid berada pada indeks 0 sampai 6 sehingga proses traversal tidak akan mengakses indeks yang kosong.

6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
Karena pada representasi Binary Tree menggunakan array berlaku aturan:
Anak kiri berada pada indeks 2*i + 1
Anak kanan berada pada indeks 2*i + 2
Oleh karena itu pemanggilan rekursif menggunakan indeks tersebut untuk mengakses anak kiri dan anak kanan dari suatu node sesuai struktur pohon biner yang tersimpan dalam array.