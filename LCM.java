import java.util.*;
//Brute force approach
//Time complexity: a*b -max(a,b)

class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int res = lcm(num1,num2);
        System.out.println("The LCM of given numbers is "+res);
    }

    static int lcm (int a, int b) {
        int res = (a>b) ? a : b;

        while (true) {
            if(res%a == 0 && res%b == 0) {
                break;
            }
            res++;
        }

        return res;
    }
}