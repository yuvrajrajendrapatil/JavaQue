import java.util.Scanner;

class PrimeNo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number");//Positive Number
        int num = scanner.nextInt();
        int i;

        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                break;

            }
        }

        if (i == (num / 2)) {
            System.out.println("It is  Prime No");

        } else {
            System.out.println("It is not Prime No");
        }

    }
}