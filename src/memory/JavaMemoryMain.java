package memory;

// 스택 구조 형태 예제
public class JavaMemoryMain {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    // m1 = 매개변수
    static void method1(int m1) {
        System.out.println("method1 start");
        // cal = 지역변수
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
