package UAS;

public class Transaksi {
    // Atribut
    private String jenis; 
    private int jumlah;

    // Constructor
    public Transaksi(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    // Accessor
    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }
}

