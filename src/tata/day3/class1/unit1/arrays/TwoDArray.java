package perfect.learn.class1.unit1.arrays;

class TwoDArray2{
    public void test1(){
        int twoD[][]= new int[4][5];
        int i, j, k = 0;
        for(i=0; i<4; i++)
            for(j=0; j<5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for(i=0; i<4; i++) {
            for(j=0; j<5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
    public void test2(){
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;
        for(i=0; i<4; i++)
            for(j=0; j<i+1; j++) {
                twoD[i][j] = k;
                k++;
            }
        for(i=0; i<4; i++) {
            for(j=0; j<i+1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }

    }
}

public class TwoDArray {
    public static void main(String[] args) {
        TwoDArray2 t1 = new TwoDArray2();
        t1.test2();
    }
}


/*
     //Multidimensional Arrays
     In Java, multidimensional arrays are actually arrays of arrays.

     When you allocate memory for a multidimensional array, you need only specify the
     memory for the first (leftmost) dimension. You can allocate the remaining dimensions.
     For example, this following code allocates memory for the first dimension of
     twoD when it is declared. It allocates the second dimension manually.
        int twoD[][] = new int[4][];
        twoD[0] = new int[5];
        twoD[1] = new int[5];
        twoD[2] = new int[5];
        twoD[3] = new int[5];

*/
