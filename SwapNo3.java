import java.util.Scanner;
class SwapNo3{
 public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter Number A :");
    int num1 = scanner.nextInt();
    System.out.println("-----------------------------------");
    System.out.println(" Enter Number B :");


    int num2 = scanner.nextInt();
    System.out.println("-----------------------------------");
    
System.out.println("Before Swap ====>  A : " +num1+ " & B : "+num2);
System.out.println("-----------------------------------");

    num1 =num1+num2;
    num2 =num1-num2;
    num1= num1-num2;

System.out.println("After Swap  ====>  A : " +num1+ " & B : "+num2);
System.out.println("-----------------------------------");



 }
}