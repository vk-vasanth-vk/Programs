import java.util.*;
//Euclid's algorithm: max(a,b) = max(a,b) - min(a,b), until both becomes equal
//Time complexity: O(max(a,b)), in the worst case

class EuclidGCD {
    public static void main(String... abc) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int res = findGcd(num1,num2);
        System.out.println("The GCD of the given number is "+res);
    }

    static int findGcd(int num1, int num2) {

        while(num1 != num2) {

            if(num1 > num2) num1 = num1 - num2;
            else    num2 = num2 - num1;
        }

        return num2;
    }
}