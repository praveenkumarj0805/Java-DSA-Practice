public class Q7 {
    public static void main(String[] args) {
        char p = '\141';
        //64+32+1 = 97
        int q = 0x5F;
        //16*5 + 15 = 95
        int r = 004;
        //4
        int combo = ((p & q) ^ r);
        //97 & 95 = 0110 0001 & 0101 1111 = 0100 0001 ^ 0000 0100 = 01000 0101 = 69 
        int finalVal = (combo > 60) ? (combo >> 2) : (combo << 2);
        //69>>2 = 17
        char res = (char) ('@' + (finalVal & 0x0F));
        //64 + 17 & 15 = 0001 0001 & 0000 1111 = 1 + 64 = 'A'
        System.out.printf("%c%X", res, finalVal);
        //17 = 11 (hexadecimal)
        //A11
    }
}
