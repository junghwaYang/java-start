package Method;

public class methodQ1 {
    public static void main(String[] args) {
        System.out.println("평균값: " + avg(1,2,3));
        System.out.println("평균값: " + avg(1,2,3));
    }

    public static double avg(int a, int b, int c) {
       int sum = a + b + c;
       return sum / 3.0;
    }
}
