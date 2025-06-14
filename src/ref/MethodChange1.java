package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value:"+dataA.value);
        changePrimitice(dataA);
        System.out.println("메서드 호출 후 dataA.value:"+dataA.value);
    }

    public static void changePrimitice(Data data) {
        data.value = 20;
    }
}
