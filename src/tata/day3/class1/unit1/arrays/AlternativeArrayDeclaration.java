package perfect.learn.class1.unit1.arrays;

public class AlternativeArrayDeclaration {
    public static void main(String[] args) {
        String a[] = new String[15];
        float []b = new float[15];

        char twoD1[][] = new char[3][4];
        char[][] twoD2 = new char[3][4];
        char TowD[][];

        TowD = new char[10][12];

        char TowD2[][] = new char[3][];
        TowD2[0] = new char[5];
        TowD2[1] = new char[3];
        TowD2[2] = new char[10];

        int ThreeD1[][][];
        int ThreeD2[][][] = new int[2][][];
        ThreeD2[0] = new int[3][];
        ThreeD2[0][0] = new int[10];
        ThreeD2[0][1] = new int[12];
        ThreeD2[0][2] = new int[14];


        ThreeD2[1][0] = new int[10];
        ThreeD2[1][1] = new int[30];
        ThreeD2[1][2] = new int[40];





    }
}

/*
    int al[] = new int[3];
    int[] a2 = new int[3];

    The following declarations are also equivalent:
    char twoD1[][] = new char[3][4];
    char[][] twoD2 = new char[3][4];

    int[] nums, nums2, nums3; // create three arrays

    creates three array variables of type int. It is the same as writing
    int nums[], nums2[], nums3[]; // create three arrays

*/
