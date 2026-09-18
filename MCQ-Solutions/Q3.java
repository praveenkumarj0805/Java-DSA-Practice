public class Q3 {
    public static void main(String[] args) {
        char base = '1';//49 in ascii
        
        int hex = 0x24;//16*2+4=36
        int oct = 040;//8*4=32

        int res = (hex - oct) + (base << 1);
        //36-32= 4 + 49<<1 = 4 + 98 = 102
        boolean check = ((res >> 3) == 12) | ((res++ & 1) == 0);
        //102>>3 = 12 == 12 = true | 102 & 1 = 0 ==0 = true true | true = true  res=103
        char out = (char) ((check ? res : 0) - ('D' - 'A'));
        //103 - 68 - 65 = 100 = 'd'
        System.out.printf("%o", (int) out);
        //100 = 0144 (octal)
        //Output:144
    }
}
