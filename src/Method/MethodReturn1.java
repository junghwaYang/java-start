package Method;

public class MethodReturn1 {
    public static void main(String[] args) {
        checkAge(20);
        checkAge(50);
        checkAge(13);
        checkAge(60);
    }

    public static void checkAge(int age) {
        if(age < 18) System.out.println(age+"살은 입장 할 수 없습니다.");
        else System.out.println(age+"살은 입장 가능 합니다.");
    }
}
