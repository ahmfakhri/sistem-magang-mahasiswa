public class Magang {
    private Mahasiswa mahasiswa;
    private Perusahaan perusahaan;
    private Dosen dosen;

    public Magang(Mahasiswa mahasiswa, Perusahaan perusahaan) {
        this.mahasiswa = mahasiswa;
        this.perusahaan = perusahaan;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosenPembimbing(Dosen dosen) {
        this.dosen = dosen;
    }

    public void tampilkanMagang() {
        System.out.println(mahasiswa.getNama() + " magang di " + perusahaan.getNama());
        if (dosen != null) {
            System.out.println("Dibimbing oleh: " + dosen.getNama());
        }
    }

    
}