/*
Problem: The Mysterious Number

A number is called a Loop Number if the following process
eventually produces 1:

Take a number, replace it with the sum of the squares of
its digits, and repeat.

Example:
19 → 1² + 9² = 82
82 → 8² + 2² = 68
68 → 6² + 8² = 100
100 → 1

If the process enters a cycle without reaching 1,
it is not a Loop Number.*/
import java.util.Scanner;

public class MysteriousNumber
{
    static int sumOfSquares(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }

    static boolean findLoop(int n){
        int slow=n;
        int fast=n;

        while(fast!=1){
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));

            if(slow==fast){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        if(findLoop(n)){
            System.out.println("Loop Number");
        }
        else{
            System.out.println("Not a Loop Number");
        }
    }
}
