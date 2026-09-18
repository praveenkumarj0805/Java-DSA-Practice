public class Q2 {
    public static void main(String[] args) {
        char tag = '\102'; //64*1+2 = 66 = 'B'
        int mask = 0x0F;//15
        int shift = 010;//8

        int acc = (tag & mask) << (shift >> 2);
        //66&15 = 0100 0010 & 0000 1110 = 0000 0010 = 2 << (8 >> 2) = 2 << 2 = 8
        acc ^= (tag > 'A' ? 0x13 : 0x07);
        //acc = 8^16+3 = 8^19 = 0000 1000 ^ 0001 0011 = 0001 1011 = 1+2+8+16=27
        char key = (char) ('A' + (acc % 10));
        //65 + 27%10 = 65 + 7 = 72 = 'H';
        System.out.printf("%c%d", key, acc & 0x07);
        //27&7 = 0001 1011 & 0000 0111 = 0000 0011 = 3
        //Output:H3
    }
}
