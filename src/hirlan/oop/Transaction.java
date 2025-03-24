package hirlan.oop;

public class Transaction extends Account {
    int transaksi;

    public Transaction(String name, int saldo,int transaksi) {
        super(name, saldo);
        transaksi = saldo;
    }
    public void setTrx(int value)
    {
        transaksi = value;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nset trx nya "
                + transaksi);
    }
}
