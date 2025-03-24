package hirlan.oop;

public class Account {
    private String name;
    private int saldo;

    public Account(String name, int saldo) {
        this.name = name;
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return ("nama saudara : "+name +"\n"
                +" "
                +"jumlah saldo : "+ saldo);
    }

}
