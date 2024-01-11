import java.util.*;
//Logic: no.of 5's(in the given factorial) = no.of trailing zeros
//Formula: result = result + (number/powof5) until the Denominator is lesser than Numerator
//Time complexity: O(log n)


class TrailingZerosinFactorial {
    public static void main (String... abc) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        int res = findZeros(input);
        System.out.print("The trailing zero's of given number "+input+" is "+res);
    }

    static int findZeros(int n) {
        int fives = 5;
        int result = 0;

        while(n >= fives) {
            result += (n/fives);
            fives *= 5;
        }
        
        return result;
    }
}