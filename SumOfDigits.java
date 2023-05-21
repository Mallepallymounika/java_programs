//java program tp print sum of the digits using do while loop
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        
        do {
            int digit = temp % 10;
            sum =sum+digit; 
            temp=temp/10; 
        } while (temp != 0);
        
        System.out.println("Sum of digits of " + number + ": " + sum);
    }
}
