package Valdi.Belajar_Java_Dasar.percobaan.testOop;

public class siswa {
    private String nama;
    private String nim;
    private Double ipk;
    private String namaBeasiswa;
    private Double besarBeasiswa;

    public siswa(String nama, String nim, Double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.namaBeasiswa = namaBeasiswa;
        this.besarBeasiswa = besarBeasiswa;
    }

    public siswa(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Double getIpk() {
        return ipk;
    }

    public void setIpk(Double ipk) {
        this.ipk = ipk;
    }

    public String getNamaBeasiswa() {
        return namaBeasiswa;
    }

    public void setNamaBeasiswa(String namaBeasiswa) {
        this.namaBeasiswa = namaBeasiswa;
    }

    public Double getBesarBeasiswa() {
        return besarBeasiswa;
    }

    public void setBesarBeasiswa(Double besarBeasiswa) {
        this.besarBeasiswa = besarBeasiswa;
    }
}
