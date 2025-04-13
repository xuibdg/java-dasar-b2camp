package hirlan.oop;

public class InternalTransfer {
    public static void main(String[] args) {
        Account akun = new Account("hirlan","432156789",2000);
        akun.nambah(100);

        Account akunsrang = new Account("batur","987654321",2000);
        akunsrang.ngurang(200);
        System.out.println(akun.toString());
        System.out.println("----------------------------------------------------");
        System.out.println(akunsrang.toString());
    }
}
