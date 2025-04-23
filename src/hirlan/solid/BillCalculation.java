package hirlan.solid;

import java.util.Random;

public class BillCalculation {
    public Order order;

    public BillCalculation(Order order) {
        this.order=order;
    }
    public void calculationBill(){
        Random rands = new Random();
        int totalAmount = rands.nextInt(200)*this.order.getQuantity();
        this.order.setTotalBillAmount(totalAmount);
        System.out.println("Order with order Id :"
                +this.order.getOrderId()
                +" total bill amount "+this.order.getTotalBillAmount());
    }
}
