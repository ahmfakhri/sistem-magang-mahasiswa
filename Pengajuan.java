public class Pengajuan {
    private static int counter = 1;

    private int id_pengajuan;
    private String status;
    private String alasan;

    private Mahasiswa mahasiswa;
    private Perusahaan perusahaan;

    public Pengajuan(Mahasiswa mahasiswa, Perusahaan perusahaan) {
        this.id_pengajuan = counter++;
        this.mahasiswa = mahasiswa;
        this.perusahaan = perusahaan;
        this.status = "Pending";
        this.alasan = "-";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getStatus() {
        return status;
    }

    public String getAlasan() {
        return alasan;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void tampilkanDetail() {
        System.out.println("ID: " + id_pengajuan);
        System.out.println("Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NPM: " + mahasiswa.getNpm());
        System.out.println("Perusahaan: " + perusahaan.getNama());
        System.out.println("Status: " + status);
        System.out.println("Alasan: " + alasan);
    }

    public String tampilkanList() {
    return mahasiswa.getNama() + " (" + mahasiswa.getNpm() + ")" +
           " - IPK: " + mahasiswa.getIpk() +
           "\n   Perusahaan : " + perusahaan.getNama() +
           "\n   Status     : " + status;
           
    }   
}