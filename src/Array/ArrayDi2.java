package Array;

public class ArrayDi2 {
    public static void main(String[] args) {
        int [][] array ={
                {1,2,3},
                {4,5,6},
        };

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
