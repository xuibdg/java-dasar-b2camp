package hirlan.oop;

public class Transaction extends Account {
    int transaksi;

    public Transaction(String name,String noRek, int saldo,int transaksi) {
        super(name,noRek, saldo);
        transaksi = saldo;
    }
    public void setTrx(int value)
    {
        transaksi = value;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nset trx nya "
                + transaksi);
    }
}
