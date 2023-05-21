//WAP to print multiplication table of any number.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int i = 1;
        
        System.out.println("Multiplication table of " + number + ":");
        do {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
            i++;
        } while (i <= 10);
    }
}
