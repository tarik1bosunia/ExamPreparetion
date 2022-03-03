package perfect.learn.class1.unit3.bitwise_operators;
// Masking sign extension.
class HexByte {
    //bujhi nai
    static public void main(String args[]) {
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;

        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}

    public class RightShiftOperator {
        public static void main(String[] args) {

        }
    }
   /*   Each time you shift a value to the right, it divides that value by two—and discards any
        remainder. In some cases, you can take advantage of this for high-performance integer
        division by 2.
        When you are shifting right, the top (leftmost) bits exposed by the right shift are filled
        in with the previous contents of the top bit. This is called sign extension and serves to preserve
        the sign of negative numbers when you shift them right. For example, –8 >> 1 is –4, which,
        in binary, is
        11111000 –8
        >> 1
        11111100 –4
        It is interesting to note that if you shift –1 right, the result always remains –1, since sign
        extension keeps bringing in more ones in the high-order bits.*/
