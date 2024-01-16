import java.util.*;
//Time complexity: O(sqrt(n))

public class EfficientPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        System.out.println(isPrime(input));
    }

    static boolean isPrime (int num) {

        if(num == 1)    return false;
        if (num == 2 || num == 3)   return true;
        if(num%2 == 0 || num%3 == 0 )   return false;

        //The difference between two cousin prime number is 6
        //This will run squareroot of num
        for(int i=5; i*i<=num; i+=6) {
            if(num%i == 0 || num%i+2 == 0)  return false;
        }

        return true;
    }
}