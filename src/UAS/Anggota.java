package UAS;

// Class
public class Anggota {
    // Atribut
    protected String nama;
    protected String peran;
    protected int saldo;

    // Constructor
    public Anggota(String nama) {
        this.nama = nama;
        this.saldo = 0;
    }

    // Mutator (Setter)
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    // Accessor (Getter)
    public int getSaldo() {
        return saldo;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }

    // Polymorphism (akan di-override)
    public String infoAnggota() {
        return nama + " adalah anggota keluarga.";
    }
}

