import java.util.Scanner;
public class SwapNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number A");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number B");
        int num2 = scanner.nextInt();

        System.out.println("Number A : "+num1+" , Number B : "+num2);
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println(" || After Swap ....|| ");
        System.out.println("Number A : "+num1+" , Number B : "+num2);

         


        


    }
    
}
