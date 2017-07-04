import java.util.Scanner;

/**
 * Created by Jeannette on 19/05/2017.
 */
public class Menus {
    private Scanner reader;
    private Airplanes flightInfo;

    public Menus(Scanner reader, Airplanes flightInfo) {
        this.reader = reader;
        this.flightInfo = flightInfo;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        handleMenuAirplanes();
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        handleMenuFlightService();
    }

    public void handleMenuAirplanes() {
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String menuChoice = reader.nextLine();
            if (menuChoice.equals("x")) {
                break;
            } else if (menuChoice.equals("1")) {
                addAirplaneInfo();
            } else if (menuChoice.equals("2")) {
                addFlightInfo();
            }
        }
    }

    public void addAirplaneInfo() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        flightInfo.addPlane(id, capacity);
    }

    public void addFlightInfo() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = reader.nextLine();
        String route = departureCode + "-" + destinationCode;
        flightInfo.addFlight(id, route);
    }

    public void handleMenuFlightService() {
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String menuChoice = reader.nextLine();
            if (menuChoice.equals("1")) {
                flightInfo.printPlanes();
            } else if (menuChoice.equals("2")) {
                flightInfo.printFlights();
            } else if (menuChoice.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                flightInfo.printPlaneInfo(id);
            } else if (menuChoice.equals("x")) {
                break;
            }
        }
    }


}
