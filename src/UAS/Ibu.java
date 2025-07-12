package UAS;

// Inheritance
public class Ibu extends Anggota {
    public Ibu(String nama) {
        super(nama);
        this.peran = "Ibu";
    }

    // Polymorphism (Override)
    @Override
    public String infoAnggota() {
        return "Ibu: " + nama + ", pengatur pengeluaran harian.";
    }
}

