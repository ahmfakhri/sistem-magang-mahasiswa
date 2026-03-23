import java.util.ArrayList;

public class Dosen extends User {
    private String nidn;
    private String nama;
    private String no_hp;

    public Dosen(int id, String username, String email, String password,
                 String nidn, String nama, String no_hp) {

        super(id, username, email, password, "Dosen");

        this.nidn = nidn;
        this.nama = nama;
        this.no_hp = no_hp;
    }

    public String getNama() {
        return nama;
    }

    public String getNidn() {
        return nidn;
    }

    // fitur utama
    public void lihatMahasiswaBimbingan(ArrayList<Magang> listMagang) {
        boolean ada = false;

        for (Magang m : listMagang) {
            if (m.getDosen() == this) {
                System.out.println("Mahasiswa : " + m.getMahasiswa().getNama());
                System.out.println("Perusahaan: " + m.getPerusahaan().getNama());
                System.out.println("------------------");
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Belum ada mahasiswa bimbingan.");
        }
    }
}