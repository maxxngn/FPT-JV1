package examjava2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerRelationshipManagement {
    private Map<String, Customer> customers;
    private Scanner sc;

    public CustomerRelationshipManagement() {
        customers = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public void addCustomer() {
        System.out.println("Enter customer details:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(name, email, phone);
        customers.put(name, customer);

        System.out.println("Customer added successfully.\n");
    }

    public void findCustomerByName() {
        System.out.print("Enter customer name to search: ");
        String name = sc.nextLine();

        Customer customer = customers.get(name);
        if (customer != null) {
            System.out.println("Customer details:");
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
        } else {
            System.out.println("Customer not found.\n");
        }
    }

    public void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.\n");
        } else {
            System.out.println("All customers:");

            for (Customer customer : customers.values()) {
                System.out.println("Name: " + customer.getName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("Phone: " + customer.getPhone());
                System.out.println();
            }
        }
    }

    public void run() {
        int choice;

        do {
            System.out.println("Customer Relationship Management");
            System.out.println("1. Add new customer");
            System.out.println("2. Find by name");
            System.out.println("3. Display all");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    findCustomerByName();
                    break;
                case 3:
                    displayAllCustomers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        } while (choice != 4);
    }
}
