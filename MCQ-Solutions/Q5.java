public class Q5 {
    public static void main(String[] args) {
        char c = 'E';
        //69
        int hex = 0x30;
        //16*3 = 48
        int oct = 060;
        //6*8 = 48
        int balance = (oct - hex) + (c & 0x0F);
        //48-48 = 0 + 69 & 15 = 0100 0101 & 0000 1111 = 0000 0101 = 5
        boolean flag = (balance++ == 5) && ((c >> 1) == 34);
        //true balance = 6 69>>1 = 34  true  true && true  = true
        int code = (flag ? balance : ~balance & 0xFF);
        //code=6
        System.out.printf("%X", code);
        //Output:6
    }
}
