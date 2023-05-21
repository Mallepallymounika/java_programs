
//java program to print alphabets,digits,special character
import java.util.*;
public class Program9{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     char a;
     System.out.println("enter a character");
     a=sc.next().charAt(0);
     if(a>='a'&& a <='z'||a>'A'&&a<='Z')
            System.out.println("character is an alphabet");
     else if(a>'0'&&a<='9')
            System.out.println("character a digit");
     else
             System.out.println("character a special charater");
   }
}
       
     


       