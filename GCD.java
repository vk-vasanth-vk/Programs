import java.util.*;
//Brute force approach
//Time complexity: O(min(a,b)) or O(n)

class GCD {
    public static void main(String... abc) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int res = findGcd(num1,num2);
        System.out.println("The GCD of given numbers is "+res);
    }

    static int findGcd(int num1, int num2) {
        //finding the minimum
        int min = Math.min(num1,num2);
        
        for(int i=min; i>0; i--) {
            if((num1%i == 0) && (num2%i == 0)) {
                return i;
            }  
        }

        return 1;
    }
}