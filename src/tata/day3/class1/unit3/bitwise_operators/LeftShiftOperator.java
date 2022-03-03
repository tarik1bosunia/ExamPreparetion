package perfect.learn.class1.unit3.bitwise_operators;

// Left shifting a byte value.
class ByteShift {
    public void test1() {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}

// Left shifting as a quick way to multiply by 2.
class MultByTwo {
    public static void main(String args[]) {
        int i;
        int num = 0xFFFFFFE;
        for(i=0; i<4; i++) {
            //num = num * 2;
            num = num << 1;
            System.out.println(num);
        }
    }
}

public class LeftShiftOperator {
    public static void main(String[] args) {
        ByteShift t1 = new ByteShift();
        t1.test1();
    }

}
/*
    Since each left shift has the effect of doubling the original value, programmers
    frequently use this fact as an efficient alternative to multiplying by 2. But you need to watch
    out.
* */
