public class Q6 {
    public static void main(String[] args) {
        char alpha = '8';
        //56
        int a = 0x0D;
        //13
        int b = 015;
        //8+5 = 13
        int metric = (alpha - '0') * (a ^ b);
        //56-48 = 8 * 13^13 = 0
        if ((metric & 1) == 0 && (a == b)) {
            metric = (metric >> 1) + 0x20;
            //0>>1 =0+16*2 = 32 
        } else {
            metric = (metric << 1) - 010;
        }
        System.out.printf("%c%d", (char) metric, metric % 7);
        //ascii of 32 is space character ' ' 32%7 = 4 
        //Output: 4   
        //Note:There is a space in output before 4
    }
}
