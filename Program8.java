// java program to check whether a number is negative, positive or zero
import java.util.*;
public class Program8{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int number=sc.nextInt();
     if(number>0)
     {
       System.out.println(" number is positive");
     }
     else if(number<0)
       {
         System.out.println(" number is negative");
       }
     else
     {
         System.out.println(" number is zero");
     }
       
       } 
}

  