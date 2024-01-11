import java.util.*;
//Formula: max(a,b) = max(a,b) % min(a,b), until anyone becomes zero
//Time complexity: O(log(min(a,b)))

class OptimizedEuclidGCD {
    public static void main(String... abc) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int res = findGcd(num1,num2);
        System.out.println("The GCD of the given numbers is "+res);
    }

    static int findGcd(int num1, int num2) {

        while(num1 != 0 && num2 != 0) {
            if(num1 > num2) num1 %= num2;
            else    num2 %= num1;
        }

        return num1+num2;
    }
}