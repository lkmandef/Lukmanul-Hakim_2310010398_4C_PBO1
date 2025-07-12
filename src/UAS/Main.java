package UAS;

// Import untuk IO dan Error Handling
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Error Handling
        try {
            System.out.print("Masukkan nama ayah: ");
            String namaAyah = input.nextLine();

            System.out.print("Masukkan nama ibu: ");
            String namaIbu = input.nextLine();

            // Object
            Ayah ayah = new Ayah(namaAyah);
            Ibu ibu = new Ibu(namaIbu);

            // Array
            Transaksi[] listTransaksi = new Transaksi[100];
            int index = 0;

            boolean jalan = true;

            // Perulangan
            while (jalan) {
                System.out.println("\n=== Menu ===");
                System.out.println("1. Tambah Pemasukan");
                System.out.println("2. Tambah Pengeluaran");
                System.out.println("3. Tampilkan Info Keluarga");
                System.out.println("4. Simpan ke File");
                System.out.println("5. Keluar");
                System.out.print("Pilih: ");

                // Seleksi
                int pilih = 0;
                try {
                    pilih = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input harus angka!");
                    continue;
                }

                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan jumlah pemasukan: ");
                        int masuk = Integer.parseInt(input.nextLine());
                        if (masuk < 0) {
                            System.out.println("Pemasukan tidak boleh negatif.");
                            break;
                        }
                        ayah.setSaldo(ayah.getSaldo() + masuk);
                        listTransaksi[index++] = new Transaksi("Pemasukan", masuk);
                        break;

                    case 2:
                        System.out.print("Masukkan jumlah pengeluaran: ");
                        int keluar = Integer.parseInt(input.nextLine());
                        if (keluar < 0 || keluar > ayah.getSaldo()) {
                            System.out.println("Pengeluaran tidak valid.");
                            break;
                        }
                        ayah.setSaldo(ayah.getSaldo() - keluar);
                        listTransaksi[index++] = new Transaksi("Pengeluaran", keluar);
                        break;

                    case 3:
                        System.out.println(ayah.infoAnggota());
                        System.out.println(ibu.infoAnggota());
                        System.out.println("Saldo keluarga: Rp " + ayah.getSaldo());
                        break;

                    case 4:
                        // IO Sederhana
                        try {
                            FileWriter writer = new FileWriter("laporan_keuangan.txt");
                            writer.write("Laporan Keuangan\n");
                            for (int i = 0; i < index; i++) {
                                writer.write(listTransaksi[i].getJenis() + ": Rp " + listTransaksi[i].getJumlah() + "\n");
                            }
                            writer.write("Saldo akhir: Rp " + ayah.getSaldo());
                            writer.close();
                            System.out.println("Laporan disimpan ke laporan_keuangan.txt");
                        } catch (IOException e) {
                            System.out.println("Gagal menyimpan file.");
                        }
                        break;

                    case 5:
                        jalan = false;
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia.");
                }
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        input.close();
    }
}
