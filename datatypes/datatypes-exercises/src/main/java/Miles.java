import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("And how much gas have you burned?  (Maybe consider an ebike?)");
        double gallons = input.nextDouble();
        System.out.printf("You're getting about %s miles per gallon.", miles / gallons);
    }

}
