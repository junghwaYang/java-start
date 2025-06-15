package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        // 여기를 실행하는 시점에서 힙영역에 포함이 된다.
        Data data1 = new Data(10);
        method2(data1); // 참조값이 복사
        System.out.println("method1 end");
    }

    // 매개변수에 참조값을 전달
    static void method2(Data data2) {
        System.out.println("method1 start");
        System.out.println("data.value:" + data2.getValue());
        System.out.println("method1 end");
    }
}
