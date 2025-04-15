package hirlan.oop;

public class Account extends Exception {
    private String name;
    private String noRek;
    private int saldo;

    public Account(String message){
        super(message);
    }

    public Account(String name,String noRek, int saldo) {
        this.name = name;
        this.noRek = noRek;
        this.saldo = saldo;
    }
    public void ngurang(int decrement)
    {

        saldo -= decrement;
    }

    public void nambah(int increment)
    {

        saldo += increment;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public String getNorek() {

        return noRek;
    }

    public void setNoRek(String noRek) {

        this.noRek = noRek;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {

        this.saldo = saldo;
    }

    public String toString(){
        return ("nama saudara : "+name +"\n"
                +"no Rekening : "+noRek+"\n"
                +"jumlah saldo : "+ saldo);
    }

}
