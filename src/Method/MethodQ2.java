package Method;

// 기존 코드 리팩토링 하기
public class MethodQ2 {

//    public static void main(String[] args) {
//        String message = 'Hello, world!';
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
//    }

    public static void main(String[] args) {
        print("Hello", 3);
        print("world", 5);
        print("안녕", 7);
    }

    public static void print(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
