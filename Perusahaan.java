public class Perusahaan {
    private int id_perusahaan;
    private String nama, email, alamat;

    public Perusahaan(String nama, String email, String alamat) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}