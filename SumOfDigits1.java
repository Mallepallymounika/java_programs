//java program to print sum of the digits using for loop
import java.util.Scanner;
public class SumOfDigits1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum;
        int digit;
      for(sum=0;number!=0;number=number/10
         )
        {
         digit = number%10;
          sum=sum+digit;
        }
      System.out.println("sum of digits :"+sum);
    }
}
      
        
