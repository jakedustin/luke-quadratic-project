import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {

        FactorialCalculator calculator = new FactorialCalculator();
        calculator.readString();

//        Take the user input in order to store the three coefficients
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

//        close the scanner
        scanner.close();

//        Now calculate the result of the discriminant based on user input to determine how many roots there will be
        double discriminant = (Math.pow(b, 2)) - (4 * a * c);

//        Now we will determine if the discriminant is positive, negative, or 0
        if (discriminant > 0) {
            System.out.println("There are two roots for the quadratic equation with these coefficients.");

            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);

        } else if (discriminant < 0) {
            System.out.println("There are no roots for the quadratic equation with these coefficients.");

        } else {
            System.out.println("There is one root for the quadratic equation with these coefficients.");

            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("r1 = " + r1);
        }
    }
}
