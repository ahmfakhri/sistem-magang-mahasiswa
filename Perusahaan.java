public class Perusahaan {
    private int id_perusahaan;
    private String nama, email, alamat;

    public Perusahaan(String nama, String email, String alamat) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
    }

    public int getIdPerusahaan() {
        return id_perusahaan;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getAlamat() {
        return alamat;
    }
}