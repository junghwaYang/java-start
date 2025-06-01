package Method;

public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(5,10);
        System.out.printf("결과 출력: %d \n", sum1);

        int sum2 = add(50,10);
        System.out.printf("결과 출력: %d \n", sum2);

        System.out.println(add(2,4));
    }

    public static int add(int a, int b){
        System.out.println(String.format("%d + %d 연산 수행", a,b));
        int sum = a + b;
        return sum;
    }

}
