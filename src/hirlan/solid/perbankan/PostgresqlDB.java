package hirlan.solid.perbankan;

import hirlan.solid.perbankan.infacerepo.Database;

//contoh DIP(Dependency Inversion Principle)
public class PostgresqlDB implements Database {

    @Override
    public void saveAccount(BankAccount bankAccount) {
        System.out.println("Menyimpan account dipostgresql ..");

    }

    @Override
    public void saveAccount() {
        System.out.println("");
    }

}
