package Array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};

        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            System.out.print(num);
        }

        for(int num: number){
            System.out.print(num);
        }

        // 향상된 배열을 사요할 수 없는 경우 => i의 값을 활용
        for(int i = 0; i<number.length; i++){
            System.out.print(number[i]);
        }
    }
}
