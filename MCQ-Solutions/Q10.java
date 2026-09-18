public class Q10 {
    public static void main(String[] args) {
        char initial = 'Z';
        //90
        int hex = 0x2B;
        //2*16+11 = 43
        int oct = 053;
        // 5*8+3 = 43
        int diff = hex - oct; 
        //0
        int reg = (initial >> 2) + diff;
        //90>>2 = 22
        boolean pass = (reg++ > 22) && ((reg & 0x03) == 3);
        //reg=23  false
        char symbol = (char) ((pass ? reg : --reg) + ('0' + 0x05));
        //22+ 48 + 5 = 75 = 'K'
        System.out.printf("%X%c", reg, symbol);
        //22 = 16 (hexadecimal)
        //Output:16K
    }
}
