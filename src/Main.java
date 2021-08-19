import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        long n = scan.nextLong();
	// write your code here

        System.out.println("The total of the digits is:");
        System.out.println(sumDigits(n));


    }

    public static int sumDigits(long n){
        int sum = 0;
        int x = (int) n;
        for(int i=x; i>=0; i--){
            int p = x%10;
            x = x/10;
            sum += p;
        }
        return sum;

    }

}
