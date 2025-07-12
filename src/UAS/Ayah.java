package UAS;

// Inheritance
public class Ayah extends Anggota {
    public Ayah(String nama) {
        super(nama);
        this.peran = "Ayah";
    }

    // Polymorphism (Override)
    @Override
    public String infoAnggota() {
        return "Ayah: " + nama + ", pengelola keuangan utama.";
    }
}

