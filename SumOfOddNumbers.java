//WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n");
        int n = scanner.nextInt();
        
        int sum = 0;
        int num = 1;
        
        do {
            if (num % 2 != 0) { 
                sum = sum+ num;
            }
            num++;
        } while (num <= n);
        
        System.out.println("Sum of odd numbers between 1 and " + n + ": " + sum);
    }
}
 