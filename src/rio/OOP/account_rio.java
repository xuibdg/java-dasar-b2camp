package rio.OOP;

// 1. buat class namanya account (encapsulation) ada field nama, norek, saldo
public class account_rio {
    private String nama;
    private String norek;
    private double saldo;

    public account_rio(String nama, String norek, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.saldo = saldo;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNorek(){
        return norek;
    }
    public void setNorek(String norek){
        this.norek = norek;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
            this.saldo = saldo;
    }
}
