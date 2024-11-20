import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        
        int digits = String.valueOf(num).length();// Count the number of digits

        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);// Calculate the sum of powers of each digit
            num /= 10;
        }

        return sum == original;
    }
}