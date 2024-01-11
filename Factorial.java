import java.util.Scanner;
//Iterative approach
//Time complexity: O(n)

class Factorial {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scnr.nextInt();

        int ans = fac(num);
        System.out.println("Factorial of the number "+num+" is: "+ans);

    }

    static int fac(int num) {
        //Initial value should be 1
        int f = 1;

        for(int i=2; i<=num; i++) f *= i;

        return f;
    }
}