package Valdi.Belajar_Java_Dasar.percobaan.testOop;

public class main {
    public static void main(String[] args) {
        siswa siswa = new siswa();
        mahasiswaBeasiswa beasiswa = new mahasiswaBeasiswa();
        beasiswa.setNamaBeasiswa("prestasi");
        beasiswa.setBesarBeasiswa(2.000000);
        siswa.setNama("val");
        siswa.setNim("a14236");
        siswa.setIpk(2.00);

        if (siswa.getIpk() > 4.00 && siswa.getIpk() > 0){
            System.out.println("ipk tidak terdeteksi");
        }else {
            System.out.println("Nama : " + siswa.getNama());
            System.out.println("NIM : " + siswa.getNim());
            System.out.println("IPK : " + siswa.getIpk());
            System.out.println("Beasiswa : " + beasiswa.getNamaBeasiswa());
            System.out.println("Jumlah : Rp."+ beasiswa.getBesarBeasiswa());
        }
    }
}
