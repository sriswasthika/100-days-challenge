Beautiful number 

import java.util.Scanner;

public class BeautifulNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isBeautifulNumber(num)) {
            System.out.println(num + " is a beautiful number.");
        } else {
            System.out.println(num + " is not a beautiful number.");
        }
    }

    public static boolean isBeautifulNumber(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == originalNum;
    }
}
