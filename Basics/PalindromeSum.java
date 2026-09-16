/*
Find a palindrome by repeatedly adding a number to its reverse, and print the resulting palindrome and number of iterations.
*/import java.util.Scanner;
public class PalindromeSum
{
    static int reverse(int n){
        int N = 0;
        while(n > 0){
            N = N * 10 + n % 10;
            n /= 10;
        }
        return N;
    }
    static boolean isPalindrome(int n){
        if(n == reverse(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int N = n;
        while(!isPalindrome(N)){
            N = N + reverse(N);
            count++;
        }
        System.out.println(N);
        System.out.println(count);
    }
}
