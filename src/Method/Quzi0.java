package Method;

public class Quzi0 {
    public static void main(String[] args) {

        System.out.println("평균값: " + avg(1,2,3));
        System.out.println("평균값: " + avg(15,25,35));
    }

    public static double avg(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
