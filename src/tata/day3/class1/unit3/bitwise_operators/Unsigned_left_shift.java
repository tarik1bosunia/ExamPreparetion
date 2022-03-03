package perfect.learn.class1.unit3.bitwise_operators;

// Unsigned shifting a byte value.
class ByteUShift {
    //can not understand
    static public void main(String args[]) {

        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println(" b = 0x"
                + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" b >> 4 = 0x"
                + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" b >>> 4 = 0x"
                + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);

        System.out.println("(b & 0xff) >> 4 = 0x"
                + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
    }
}

public class Unsigned_left_shift {
}

/*
    The Unsigned Right Shift
    As you have just seen, the >> operator automatically fills the high-order bit with its previous
    contents each time a shift occurs. This preserves the sign of the value. However, sometimes
    this is undesirable. For example, if you are shifting something that does not represent a
    numeric value, you may not want sign extension to take place. This situation is common
    when you are working with pixel-based values and graphics. In these cases, you will
    generally want to shift a zero into the high-order bit no matter what its initial value was.
    This is known as an unsigned shift. To accomplish this, you will use Java’s unsigned,
     shiftright operator, >>>, which always shifts zeros into the high-order bit.
*/
