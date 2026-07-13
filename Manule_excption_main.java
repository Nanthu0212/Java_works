class Soo_Sorry_error extends Exception {
    public Soo_Sorry_error(String message) {
        super(message);
    }
}

class Manule_excption {
    public void checkAge(int age) throws Soo_Sorry_error {
        if (age < 18) {
            throw new Soo_Sorry_error("So Sorry!Age must be 18 or above. You entered: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

public class Manule_excption_main {
    public static void main(String[] args) {
        Manule_excption manule = new Manule_excption();
        try {
            manule.checkAge(15);
        } catch (Soo_Sorry_error e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}