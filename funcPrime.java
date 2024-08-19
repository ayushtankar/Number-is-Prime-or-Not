import java.util.*;

public class funcPrime {

    public static boolean isprime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        num = sc.nextInt();

        if (isprime(num)) {
            System.out.println(num + " is a Prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }

}