import java.util.*;
//Time complexity: O(n), in the worst case

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        
        isPrime(input);
    }

    static void isPrime (int num) {
        boolean flag = true;

        for(int i=2; i<=num/2; i++) {
            if(num%i == 0)  {
                flag = false;
                System.out.print("The given number "+num+" is not prime");
                break;
            }
        }
        if(flag == true)    System.out.println("The given number "+num+" is prime");
    }
}