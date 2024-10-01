import java.util.Scanner;

class PrimeNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any poisitive number");
        int num = scanner.nextInt();
        int i;

        for (i = 2; i <= (int) Math.ceil(Math.sqrt(num)); i++) {
            if (num % i == 0) {
                break;

            }
        }

        if (i > (int) Math.ceil(Math.sqrt(num)) && num != 1) {
            System.out.println("It is  Prime No");

        } else {
            System.out.println("It is not Prime No");
        }

    }
}