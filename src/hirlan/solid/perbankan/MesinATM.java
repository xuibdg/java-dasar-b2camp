package hirlan.solid.perbankan;

import hirlan.solid.perbankan.infacerepo.ATMOperations;

//contoh fungsi berbeda yang dimaksud ISP
public class MesinATM implements ATMOperations {

    @Override
    public void displayBalance(){
        System.out.println("Tampilkan Saldo :");

    }
    @Override
   public void printReceipt(){
        System.out.println("Cetak Struk :");

    }

}
