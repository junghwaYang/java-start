package Array;

import java.util.Scanner;

public class ArrayQ2 {
    public static void main(String[] args) {
        // 사용자에게 5개의 정수를 받아 쉼표를 넣어 순차적으로 출력하기 (단, 마지막에는 쉼표를 넣지않도록)

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력 하세요: ");
        for(int i=0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("===출력===");

        for (int i=0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length - 1) System.out.print(", ");
        }
    }
}
