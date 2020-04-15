import java.util.Scanner;
/*Java program to determine if a number
 *is positive or negative
 *the user will enter a number
 */
public class PositiveNegative {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int number;

        //Prompt a user to enter a number
        System.out.print("Enter a number: ");
        number = in.nextInt();

        if (number > 0)
            System.out.println(number + " is a positive number.");
        else if (number < 0)
            System.out.println(number + " is a negative number.");
        else
            System.out.println(number + " is neither positive, nor negative.");
    }
}
