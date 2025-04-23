package hirlan.solid;

public class GroupMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Mamang");
        customer1.setAddress("jl.dago");

        Order order1= new Order();
        order1.setItemName("Roti bumbu bakar");
        order1.setQuantity(3);
        order1.setCustomer(customer1);

        order1.preOrder();

        BillCalculation billCalculation = new BillCalculation(order1);
        billCalculation.calculationBill();

        DeliveryApp deliveryApp = new DeliveryApp(order1);
        deliveryApp.delivery();
    }
}
