//write a java program to check whether number is a valid mobile number or not( A number is valid mobile  number if it contains 10 digits)(use  only conditionals)(don't use loops)
import java.util.*;
public class Sample_Main{
  public static void main(String[]args){
  Sample A = new Sample();
  A.Sample1();
}
}
 class Sample{
  public void Sample1(){
    
   int num;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     num=sc.nextInt();
    if(num%2==0){
      System.out.println("the given number is even");
    }
    else{
      System.out.println("the given number is add");
    }
  }
 }