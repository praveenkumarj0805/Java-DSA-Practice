public class Q4 {
    public static void main(String[] args) {
        char letter = 'F';
        //70
        int num = 0x14;
        //16+4 = 20
        int step = 007;
        //7
        int val = (letter - num) ^ step;
        //70-20 = 50^7 = 0011 0010 ^ 0000 0111 = 0011 0101 = 1+4+16+32=53
        while (val > 50) {
            val -= (val % 2 == 0) ? (val & 3) + 1 : 3;
            //val = 53 - 3 = 50 
        }
        System.out.printf("%c%X", (char) ('A' + (val % 6)), val);
        //65+50%6= 65 + 2 = 67 = 'C' 50 = 0x32 (hexadecimal)
        //Output:C32
    }
}
