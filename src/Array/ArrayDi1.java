package Array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int [][] array = new int [2][3]; // 2행 3열

        array[0][0] = 1; // 0행, 0열
        array[0][1] = 2; // 0행, 1열
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
