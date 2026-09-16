/*
Print a triangle of numbers by skipping numbers that are divisible by 3 or end with 3.
*/
import java.util.Scanner;
public class ValidNumberTriangle
{
    static void printTriangle(int n){
        int start = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(start % 10 != 3 && start % 3 != 0){
                    System.out.print(start + " ");
                }
                else{
                    j--;
                }
                start++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printTriangle(n);
    }
}
