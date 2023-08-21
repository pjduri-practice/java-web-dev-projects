import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Let's build a rectangle!\nPlease enter a length: ");
        int length = input.nextInt();
        System.out.println("How about the width: ");
        int width = input.nextInt();
        // makes using String.format unnecessary
        System.out.printf("""
                        Great!
                The area of your rectangle is:
                    %s.
                %n""", length * width);
        input.close();

    }

}
