package rio.task_17_apr_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<orderRio> orderRios = new ArrayList<>();

        orderRios.add(new orderRio("11", "laptop", 1, 7500000));
        orderRios.add(new orderRio("25", "Mouse", 2, 75000));
        orderRios.add(new orderRio("8", "Kabel HDMI", 3, 30000));
        orderRios.add(new orderRio("19", "Keyboard", 1, 180000));

        int pilihan;
            System.out.println("==== ORDER MENU =====");
            System.out.println("\n1. Show all order data");
            System.out.println("2. Show orders with total > Rp100,000");
            System.out.println("3. Show orders with the largest total transactions");
            System.out.println("4. Sort orders from largest to smallest total");
            System.out.println("\nShow Command: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n==== All Order Data ====");
                    for (orderRio o : orderRios) {
                        o.printDetail();
                    }
                    break;
                case 2:
                    System.out.println("\n=== Orders with Total > Rp100,000 ===");
                    for (orderRio o : orderRios) {
                        if (o.getTotalPrice() > 100000) {
                            o.printDetail();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n=== Orders with the Largest Total Transactions ===");
                    orderRio maxOrder = Collections.max(orderRios, Comparator.comparingDouble(orderRio::getTotalPrice));
                    maxOrder.printDetail();
                    break;

                case 4:
                    System.out.println("\n=== Order from largest to smallest total ===");
                    orderRios.sort((a, b) -> Double.compare(b.getTotalPrice(), a.getTotalPrice()));
                    for (orderRio o : orderRios) {
                        o.printDetail();

                    }
                    break;

                default:
                    System.out.println("ERROR : Invalid Choice!");
            }
        scanner.close();
    }
}
