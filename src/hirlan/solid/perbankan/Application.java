package hirlan.solid.perbankan;

import hirlan.solid.perbankan.infacerepo.Database;

public class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }
    public void saveAccount(BankAccount bankAccount){
        database.saveAccount(bankAccount);
    }
}
