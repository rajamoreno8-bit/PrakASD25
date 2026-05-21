// DoubleLinkedListMain.java
package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        int pilih;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add Index");
            System.out.println("4. Insert After");
            System.out.println("5. Remove First");
            System.out.println("6. Remove Last");
            System.out.println("7. Remove After");
            System.out.println("8. Remove Index");
            System.out.println("9. Print");
            System.out.println("10. Print Reverse");
            System.out.println("11. Get First");
            System.out.println("12. Get Last");
            System.out.println("13. Get Index");
            System.out.println("14. Size");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("NIM   : ");
                    String nim1 = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama1 = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas1 = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk1 = sc.nextDouble();

                    dll.addFirst(new Mahasiswa(nim1, nama1, kelas1, ipk1));
                    break;

                case 2:
                    System.out.print("NIM   : ");
                    String nim2 = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama2 = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas2 = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk2 = sc.nextDouble();

                    dll.addLast(new Mahasiswa(nim2, nama2, kelas2, ipk2));
                    break;

                case 3:
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    System.out.print("NIM   : ");
                    String nim3 = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama3 = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas3 = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk3 = sc.nextDouble();

                    dll.add(index, new Mahasiswa(nim3, nama3, kelas3, ipk3));
                    break;

                case 4:
                    System.out.print("Masukkan NIM key: ");
                    String key = sc.nextLine();

                    System.out.print("NIM   : ");
                    String nim4 = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama4 = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas4 = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk4 = sc.nextDouble();

                    dll.insertAfter(key, new Mahasiswa(nim4, nama4, kelas4, ipk4));
                    break;

                case 5:
                    dll.removeFirst();
                    break;

                case 6:
                    dll.removeLast();
                    break;

                case 7:
                    System.out.print("Masukkan NIM key: ");
                    String keyRemove = sc.nextLine();

                    dll.removeAfter(keyRemove);
                    break;

                case 8:
                    System.out.print("Masukkan index yang dihapus: ");
                    int hapus = sc.nextInt();

                    dll.remove(hapus);
                    break;

                case 9:
                    dll.print();
                    break;

                case 10:
                    dll.printReverse();
                    break;

                case 11:
                    dll.getFirst();
                    break;

                case 12:
                    dll.getLast();
                    break;

                case 13:
                    System.out.print("Masukkan index: ");
                    int cari = sc.nextInt();

                    dll.getIndex(cari);
                    break;

                case 14:
                    System.out.println("Jumlah data: " + dll.size());
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}