package rio.exception;

// - membuat exception custom dengan case yg berbeda tiap orang
// - memakai try, catch dan finaly

public class CustomHeightException extends Exception{
    public CustomHeightException(String message) {
        super(message);
    }
}
class CustomExceptionRio {
    public static void main(String[] args) {
        try {
            validasiTinggiBadan(170);
        }catch (CustomHeightException e){
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }finally {
            System.out.println("Proses Selesai");
        }
    }
    public static void validasiTinggiBadan(int tinggiBadan) throws CustomHeightException {
        if (tinggiBadan < 170) {
            throw new CustomHeightException("Tinggi badan minimal 170");
        }else {
            System.out.println("Tinggi badan mencukupi: " + tinggiBadan);
        }
    }
}
