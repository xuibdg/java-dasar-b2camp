package hirlan.solid.perbankan.infacerepo;

import hirlan.solid.perbankan.BankAccount;

public interface Database {

    void saveAccount(BankAccount bankAccount);

    void saveAccount();
}
