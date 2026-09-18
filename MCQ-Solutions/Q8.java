public class Q8 {
    public static void main(String[] args) {
        char ch = 'M';
        //77
        int hex = 0x10;
        //16
        int oct = 020;
        //16
        int tracker = (hex == oct) ? (ch | 0x20) : (ch & ~0x20);
        //77 | 32 = 0100 1101 | 0010 0000 = 0110 1101 = 1+4+8+32+64 = 109

        boolean flag = ((tracker & 1) != 0) ^ ((tracker >> 4) == 6);
        //109&1 = 1 != 0 = true ^ 109>>4 = 6 == 6 = true  true ^  true = false
        char marker = (char) (flag ? tracker - 10 : tracker + 10);
        //109+10 = 119 = 'w'
        System.out.printf("%c%d", marker, tracker % 9);
        //119 % 9 = 1
        //Output:w1
    }
}
