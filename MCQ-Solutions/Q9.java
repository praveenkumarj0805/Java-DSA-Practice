public class Q9 {
    public static void main(String[] args) {
        char seed = '3';
        //51
        int x = 0x0E;
        //14
        int y = 016;
        //8+6=14
        int score = (seed - '0') + (x ^ y);
        //51-48 = 3 + 14 ^ 14 = 3 + 0 = 3
        for (int i = 1; i <= 3; i++) {
            score = (i % 2 != 0) ? (score << 1) : (score >> 1);
            score ^= (i & 1);
        }
        /*
        i=1
        score=3<<1 = 6
        score = 6 ^ 1 = 7
        
        i=2
        score=6>>1 = 3
        score = 3 ^ 0 = 3
        
        i=3
        score=3<<1 = 6
        score = 6 ^ 1 = 7
        
        */

        char outChar = (char) ('@' + (score & 7));
        //64 + 7 & 7 = 64 + 7 = 71 = 'G'

        System.out.printf("%c%d", outChar, score);
        //Output:G7
    }
}
