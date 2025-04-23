package hirlan.solid;

public class DeliveryApp {
    private Order order;
    public  DeliveryApp(Order order){
        this.order=order;
    }
    public void delivery(){
        System.out.println("Delivery Order ");
        System.out.println("Order with order Id :"
                +this.order.getOrderId()
                +" Delivered to "
                +this.order.getCustomer().getName());
        System.out.println("Order is delivered to "
                +this.order.getCustomer().getAddress());
    }
}
