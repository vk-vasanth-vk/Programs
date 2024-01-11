import java.util.*;
//Time complexity: O(n)

class CountDigits {
    public static void main(String[] abc) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter a number: ");
       int input = scan.nextInt();

       int res = count(input);
       System.out.println("The count of the number "+input+" is "+res);
    }

    static int count(int num) {
      int count = 0;

      while (num != 0) {
         num /= 10;
         count++;   
      }

      return count;
    }
   }