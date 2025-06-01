package Method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeValue 호출 전, num1 : " + num1 );
        num1 = changeValue(num1);
        System.out.println("changeValue 호출 후, num1 : " + num1 );
    }

    public static int changeValue(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
