package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("메서드 호출 전 a:"+a);
        changePrimitice(a);
        System.out.println("메서드 호출 후 a:"+a);
    }

    public static void changePrimitice(int x) {
        x = 20;
    }
}
