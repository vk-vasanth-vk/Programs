import java.util.*;
//Time complexity O(log(min(a,b))) as same as "optimized Euclid's GCD algorithm"
//Formula: LCM(a,b) = (a*b) / GCD(a,b)

class EuclidLCM {
    public static void main(String... abc) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int res = findLcm(num1, num2);
        System.out.println("The LCM of the given numbers is "+res);
    }

    static int findLcm(int a, int b) {
        int res = (a*b) / findGcd(a,b);
        return res;
    }

    static int findGcd(int a, int b) {
        while(a != 0 && b != 0) {
            if(a > b)   a %= b;
            else    b %= a;
        }
        return a+b;
    }
}