import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class InvalidTrainException extends Exception {
    public InvalidTrainException(String message) { super(message); }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) { super(message); }
}

class TicketLimitException extends Exception {
    public TicketLimitException(String message) { super(message); }
}

class FoodNotAvailableException extends Exception {
    public FoodNotAvailableException(String message) { super(message); }
}

class NotEligibleException extends Exception {
    public NotEligibleException(String message) { super(message); }
}

public class rail_way_booking {

    private static final Set<Integer> validTrainNumbers = new HashSet<>();
    private static final Set<String> availableFoodOptions = new HashSet<>();

    static {
        validTrainNumbers.add(12345);
        validTrainNumbers.add(23456);
        validTrainNumbers.add(34567);
        validTrainNumbers.add(45678);

        availableFoodOptions.add("veg");
        availableFoodOptions.add("non-veg");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter passenger name: ");
            String name = scanner.nextLine();
            if (name == null || name.trim().isEmpty())
                throw new NullPointerException("Passenger name cannot be null or empty.");

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter train number: ");
            int trainNumber = scanner.nextInt();

            System.out.print("Enter number of tickets (max 6): ");
            int numTickets = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter food preference (Veg / Non-Veg): ");
            String foodPreference = scanner.nextLine().trim();

            validateAge(age);
            validateTrainNumber(trainNumber);
            validateTicketLimit(numTickets);
            validateFoodPreference(foodPreference);

            System.out.println("\n=== Booking Confirmed ===");
            System.out.println("Passenger       : " + name);
            System.out.println("Age             : " + age);
            System.out.println("Train Number    : " + trainNumber);
            System.out.println("Tickets Booked  : " + numTickets);
            System.out.println("Food Preference : " + foodPreference);

            System.out.println("\nChoose an offer option:");
            System.out.println("0 - Default (No offer)");
            System.out.println("1 - Senior Citizen");
            System.out.println("2 - Ex-Serviceman");
            System.out.print("Enter your choice: ");
            int offerChoice = scanner.nextInt();
            scanner.nextLine();

            validateOffer(offerChoice, age, scanner);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type. Please enter numbers where required.");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException | InvalidTrainException | TicketLimitException | FoodNotAvailableException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (NotEligibleException e) {
            System.out.println("Offer Error: " + e.getMessage());
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 5) throw new InvalidAgeException("Age must be at least 5 years.");
    }

    private static void validateTrainNumber(int trainNumber) throws InvalidTrainException {
        if (!validTrainNumbers.contains(trainNumber))
            throw new InvalidTrainException("Train number " + trainNumber + " is not valid.");
    }

    private static void validateTicketLimit(int numTickets) throws TicketLimitException {
        if (numTickets < 1 || numTickets > 6)
            throw new TicketLimitException("Number of tickets must be between 1 and 6.");
    }

    private static void validateFoodPreference(String food) throws FoodNotAvailableException {
        if (food == null || food.isEmpty())
            throw new FoodNotAvailableException("Food preference cannot be empty.");
        if (!availableFoodOptions.contains(food.toLowerCase()))
            throw new FoodNotAvailableException("'" + food + "' is not available. We offer: Veg, Non-Veg");
    }

    private static void validateOffer(int choice, int age, Scanner scanner) throws NotEligibleException {
        switch (choice) {
            case 0:
                System.out.println("No offer selected. Standard fare applies.");
                break;

            case 1:
                if (age >= 60) {
                    System.out.println("Eligible for Senior Citizen offer!");
                } else {
                    throw new NotEligibleException("Age " + age + " is below 60. Not eligible for Senior Citizen offer.");
                }
                break;

            case 2:
                System.out.print("Enter ID number: ");
                String idNumber = scanner.nextLine().trim();

                System.out.print("Enter batch details: ");
                String batchDetails = scanner.nextLine().trim();

                if (idNumber.isEmpty() || batchDetails.isEmpty()) {
                    throw new NotEligibleException("ID number and batch details are required. Not eligible for Ex-Serviceman offer.");
                }
                System.out.println("Eligible for Ex-Serviceman offer!");
                System.out.println("ID Number      : " + idNumber);
                System.out.println("Batch Details  : " + batchDetails);
                break;

            default:
                throw new NotEligibleException("Invalid offer choice: " + choice);
        }
    }
}