import java.util.*;
//Brute force approach
//Time complexity: O(n*root(n))

class PrintPrime {
    public static void main(String... abc) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        printPrime(input);
    }

    static void printPrime(int n) {

        for(int i=2; i<=n; i++) {
            if(isPrime(i))  System.out.print(i+" ");
        }
    }

    static boolean isPrime (int num) {

        if(num == 1)  return false;
        if(num==2 || num==3)    return true;
        if(num%2==0 || num%3==0)    return false;

        for(int i=5; i*i<=num; i+=6) {
            if(num%i==0 || num%i+2==0)    return false;
        }

        return true;
    }
}
