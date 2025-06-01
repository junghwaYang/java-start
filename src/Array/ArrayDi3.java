package Array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int [][] array = new int[10][10]; // 크기만 지정

        int i = 1;
        // 행에 대한 반복문
        for (int row = 0; row < array.length; row++){
            // 열에 대한 반복문
            for (int col = 0; col < array[row].length; col++){
                array[row][col] = i++;
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

//        for (int row = 0; row < 2; row++) {
//            for (int col = 0; col < 3; col++) {
//                System.out.print(array[row][col] + " ");
//            }
//            System.out.println();
//        }

        // 출력단과 값을 넣어주는 for가 중복되어있을때는 차지하는 데이터의 크기는 차이가 많지않은지?
    }
}
