package Method;

public class MethodReturn {
    public static void main(String[] args) {
        boolean result = diff(5);
        System.out.println("해당 수는 짝수 인가요?: " + result);
    }

    public static boolean diff(int number) {
        return number % 2 == 0;
    }
}

