# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana manajemen keuangan dalam rumah tangga menggunakan bahasa pemrograman Java, dibuat sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna (keluarga) mencatat pemasukan dan pengeluaran, menampilkan informasi anggota keluarga (ayah dan ibu), serta menyimpan laporan transaksi ke file. Aplikasi dibangun dengan konsep OOP seperti Class, Inheritance, Encapsulation, dan Polymorphism serta dilengkapi fitur IO dan error handling.

## Penjelasan Kode

Berikut adalah bagian-bagian kode yang mencerminkan konsep OOP:

1. Class
   Program ini memiliki beberapa class: Anggota, Ayah, Ibu, Transaksi, dan Main.

2. Object
   Objek dibuat berdasarkan class-class di atas, menggunakan data yang dimasukkan pengguna.

   Contoh:
   Ayah ayah = new Ayah(namaAyah);
   Ibu ibu = new Ibu(namaIbu);

   Nama ayah dan ibu diambil dari input user melalui Scanner.

3. Atribut
   Contoh atribut pada class Anggota dan Transaksi:

   protected String nama;
   protected int saldo;
   private String jenis;
   private int jumlah;

4. Constructor
   Setiap class menggunakan konstruktor untuk menginisialisasi data:

   public Anggota(String nama) { ... }
   public Ayah(String nama) { super(nama); this.peran = "Ayah"; }

5. Mutator (Setter)
   Digunakan untuk mengubah nilai atribut:

   public void setSaldo(int saldo) {
       this.saldo = saldo;
   }

6. Accessor (Getter)
   Digunakan untuk mengambil nilai atribut:

   public int getSaldo() {
       return saldo;
   }

7. Encapsulation
   Atribut disembunyikan dengan private/protected dan diakses melalui setter/getter:

   protected String nama; // diakses via getNama()

8. Inheritance
   Class Ayah dan Ibu mewarisi class Anggota menggunakan extends:

   public class Ayah extends Anggota { ... }

9. Polymorphism
   Method infoAnggota() di-override di class Ayah dan Ibu:

   @Override
   public String infoAnggota() {
       return "Ayah: " + nama;
   }

10. Seleksi
    Struktur kontrol digunakan untuk memilih menu:

    switch (pilih) {
        case 1: ...
        case 2: ...
    }

11. Perulangan
    Perulangan while digunakan untuk terus menampilkan menu hingga pengguna keluar:

    while (jalan) {
        ...
    }

12. Input Output Sederhana
    Menggunakan Scanner dan FileWriter untuk interaksi dan penyimpanan file:

    Scanner input = new Scanner(System.in);
    FileWriter writer = new FileWriter("laporan_keuangan.txt");

13. Array
    Array digunakan untuk menyimpan data transaksi:

    Transaksi[] transaksiList = new Transaksi[100];

14. Error Handling
    Program menggunakan tiga jenis error handling:
    - Global try-catch: menangani semua kesalahan umum dalam blok `main`
    - Input menu: try-catch untuk menangani jika user mengetik bukan angka
    - IO: try-catch saat menyimpan file dengan FileWriter

    Contoh:

    try {
        pilih = Integer.parseInt(input.nextLine());
    } catch (NumberFormatException e) {
        System.out.println("Input harus angka!");
    }

    try {
        FileWriter writer = new FileWriter("laporan_keuangan.txt");
        ...
        writer.close();
    } catch (IOException e) {
        System.out.println("Gagal menyimpan file.");
    }

## Usulan Nilai

No  | Materi         | Nilai
----|----------------|------
 1  | Class          | 5
 2  | Object         | 5
 3  | Atribut        | 5
 4  | Constructor    | 5
 5  | Mutator        | 5
 6  | Accessor       | 5
 7  | Encapsulation  | 5
 8  | Inheritance    | 5
 9  | Polymorphism   | 10
10  | Seleksi        | 5
11  | Perulangan     | 5
12  | IO Sederhana   | 10
13  | Array          | 15
14  | Error Handling | 15
    | TOTAL          | 100

## Pembuat
Nama: Lukmanul Hakim
NPM: 2310010398  
