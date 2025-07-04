package Array;

import java.util.Scanner;

public class ArrayQ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subject = {"국어", "영어", "사회"};

        for (int i=0; i < 4; i++){
            System.out.println((i+1) + " 번 학생의 성적을 입력 하세요: ");
            for(int j=0; j < 3; j++){
                System.out.println(subject[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i < 4; i++){
            int total = 0;

            for (int j=0; j < 3; j++){
                total += scores[i][j];
            }

            double avg = total / (double) subject.length;
            System.out.println((i+1) + " 번 학생의 총점: " + total);
            System.out.println((i+1) + " 번 학생의 평균: " + avg);
        }
    }
}
