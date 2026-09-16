/*
Problem:
Repeatedly remove one occurrence of the largest digit
and find the product of the remaining digits until
only one digit remains.

Input:
5824

Output:
0

Test Cases:
1. Input: 999
   Output: 1

2. Input: 12345
   Output: 2

3. Input: 7777
   Output: 9

4. Input: 105
   Output: 0
*/

import java.util.*;

public class RemoveLargestAndProduct
{
    static int maxDigit(int n){
        int max=-1;
        while(n>0){
            int digit=n%10;
            if(digit>max){
                max=digit;
            }
            n/=10;
        }
        return max;
    }

    static int remove(int n){
        int max=maxDigit(n);
        int result=0;
        int place=1;
        boolean flag=false;
        while(n>0){
            int digit=n%10;
            if(digit!=max || flag){
                result=result+digit*place;
                place*=10;
            }
            else{
                flag=true;
            }
            n/=10;
        }
        return result;
    }

    static int product(int n){
        if(n==0){
            return 0;
        }
        int p=1;
        while(n>0){
            p=p*(n%10);
            n/=10;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        while(temp%10!=temp){
            temp=product(remove(temp));
        }
        System.out.println(temp);
    }
}
