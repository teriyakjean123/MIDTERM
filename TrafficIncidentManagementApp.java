
// TrafficIncidentManagementApp.java
import java.util.Scanner;

public class TrafficIncidentManagementApp {
    public static void main(String[] args) {
        TrafficIncidentManagementSystem system = new TrafficIncidentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Traffic Incident Management System");

        while (true) { // Loop for menu options
            System.out.println("\nMenu:");
            System.out.println("1. Report an Incident");
            System.out.println("2. Display Incidents");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the type of incident: ");
                    String type = scanner.nextLine();
                    System.out.print("Enter the location of incident: ");
                    String location = scanner.nextLine();
                    system.reportIncident(type, location);
                    break;
                case 2:
                    system.displayIncidents();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
