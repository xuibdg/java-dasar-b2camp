package jauhari.belajar_java_dasar.playground;

public class CustomerApp {
    public static void main(String[] args) {
        CustomerEncap customer1 = new CustomerEncap();
        Passport passport1 = new Passport();
        customer1.setCustomerId(10);
        customer1.setName("Jau");
        customer1.setAge(29);
        customer1.setPassportNumber("F1234567");

        passport1.setCustomerId(40);
        passport1.setName("Dhil");
        passport1.setAge(25);
        passport1.setPassportNumber("231h890");

        System.out.println(customer1.getCustomerId());
        System.out.println(customer1.getName());
        System.out.println(customer1.getAge());
        System.out.println(customer1.getPassportNumber());

        System.out.println(passport1.getCustomerId());
        System.out.println(passport1.getName());
        System.out.println(passport1.getAge());
        System.out.println(passport1.getPassportNumber());
    }
}
