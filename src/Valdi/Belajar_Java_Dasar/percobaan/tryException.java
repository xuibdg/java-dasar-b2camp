package Valdi.Belajar_Java_Dasar.percobaan;

public class tryException extends Exception {
    public tryException(String message) {
        super(message);
    }
}

class bank {
    public static void main(String[] args) {
        int jumlah = 20000;
        int saldo = 15000;

        try {
            System.out.println("total saldo anda : " + saldo);

            if (saldo < jumlah){
                throw new tryException("saldo tidak mencukupi!.");
            }
            System.out.println("transaksi berhasil.");
        } catch (tryException e) {
            System.out.println("terjadi eror : " + e.getMessage());
        }finally {
            System.out.println("===== transaksi selesai =====");
        }

    }
}