public class Q1 {
    public static void main(String[] args) {
        char ch = 'C';//67
        int hex = 0x1B;//16+11=27
        int oct = 031;//8*3+1=25

        int score = (ch ^ hex) + (oct >> 2);
        //67^27 0100 0011 ^ 0001 1011 = 0101 1000 = 64+16+8 = 88 + 25>>2 = 88 + 6 = 94
        boolean flag = (hex > oct) && ((score++ == 76) || (++score == 78));
        //score=96 flag=false
        char token = (char) ((flag ? score : score - 2) + ('a' - 0x58));
        //score=94+(97-16*5+8) = 94+9 = 103 = 'g'
        System.out.printf("%X", (int) token);
        //103 = 0x67 (hexadecimal)
        //output:67
    }
}
