//java program to print product of the digits using do while loop

import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int product = 1;
        int temp = number;
        
        do {
            int digit = temp % 10; 
            product= product*digit; 
            temp =temp/10; 
        } while (temp != 0);
        
        System.out.println("Product of digits of " + number + "is" + product);
    }
}
