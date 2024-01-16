import java.util.*;
//Sieve of Eratosthenes method
//Time complexity: O(root(n)log(log(n)))

class EfficientPrintPrime {
    public static void main(String... abc) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        printPrime(input);
    }

    static void printPrime(int n) {
        boolean [] prime = new boolean[n+1];

            for(int i=2; i*i<=n; i++) {
                if(prime[i] == false) {
                    //Changing the 'i' multiple's value = true
                    for(int j=i*i; j<=n; j+=i) {
                        prime[j] = true;
                    }
                }
            }

            for(int i=2; i<=n; i++) {
                if(prime[i] == false)   System.out.print(i+" ");
            }
    }
}