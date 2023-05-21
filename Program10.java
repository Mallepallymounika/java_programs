
//java program to print wheather an alphabet is ovel or consonent
import java.util.*;
public class Program10{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a alphabet");
     char a=sc.next().charAt(0);
     if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        System.out.println("a is a ovel");
     else
   System.out.println("enter a consonent");
   }
}