import java.util.Scanner;

class PrimeNo2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any poisitive number");
        int num = scanner.nextInt();
        int i;
        int count = 0;

        for (i = 2; i <= num / 2; i++) {

           if (num % i==0){
            count++;

           }
        }

        if (count==0) {
            System.out.println("It is Prime No");

        } else {
            System.out.println("It is not Prime No");
        }

    }
}