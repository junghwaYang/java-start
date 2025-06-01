package Array;

import java.util.Scanner;

public class ArrayQ4 {
    public static void main(String[] args) {
        // 입력받은 수의 최대값, 최소값 구하기

        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 받을 숫자의 갯수를 입력 하세요: ");
        int num = scanner.nextInt();

        int [] numbers = new int[num];
        int minNum, maxNum;

        System.out.print(num + "개의 정수를 입력 하세요: ");
        for (int i=0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }

        minNum = numbers[0];
        maxNum = numbers[0];

        for (int i=0; i < num; i++){
            if (numbers[i] < minNum) minNum = numbers[i];
            if (numbers[i] > maxNum) maxNum = numbers[i];
        }

        System.out.println("최소값: " + minNum);
        System.out.println("최대값: " + maxNum);

    }
}
