package jauhari.belajar_java_dasar.playground;

public class CustomerApp {
    public static void main(String[] args) {
        CustomerEncap customer1 = new CustomerEncap();
        customer1.setCustomerId(10);
        customer1.setName("Jau");
        customer1.setAge(29);
        customer1.setPassportNumber("F1234567");

        System.out.println(customer1.getCustomerId());
        System.out.println(customer1.getName());
        System.out.println(customer1.getAge());
        System.out.println(customer1.getPassportNumber());
    }
}
