import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobileService m = new MobileService(10);

        while (true) {
            System.out.println("\n===== Startup Mobile Store =====");
            System.out.println("1. Add Mobile");
            System.out.println("2. View Mobiles");
            System.out.println("3. Search Mobile by ID");
            System.out.println("4. Buy Mobile");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
				case 1 -> {
                   System.out.print("Enter Mobile ID: ");
				   int id = sc.nextInt();
                   sc.nextLine();
					System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter Model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble(); 
                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();
					m.addMobile(new Mobile(id, brand, model,price,stock));
					break;
                }
                case 2 -> m.viewMobile();
                case 3 -> {
                    System.out.print("Enter the Mobile ID: ");
                    int id1 = sc.nextInt();
                    try {
                        m.viewMobilesById(id1);
                    } catch (MobileNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.print("Enter the Mobile ID to buy: ");
                    int id2 = sc.nextInt();
                    try {
                        m.buyMobiles(id2);
                    } catch (MobileNotFoundException | OutOfStockException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Exiting! Thank you for using Mobile Application");
                    sc.close();
                    return; // exit the program
                }
                default -> System.out.println("Wrong Choice!");
            }
        }
    }
}