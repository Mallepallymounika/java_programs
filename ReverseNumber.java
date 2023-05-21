//java program to print reverse of numbers using do while loop
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reverse = 0;
        int temp = number;
        
        do {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp =temp/10; 
        }
          while (temp != 0);
        
        System.out.println("Reverse of " + number + "is " + reverse);
    }
}
