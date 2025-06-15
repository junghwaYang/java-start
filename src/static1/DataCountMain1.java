package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A"); // 힙 생성
        System.out.println("A count:" + data1.count);

        Data1 data2 = new Data1("B"); // 힙 생성
        System.out.println("B count:" + data2.count);

        Data1 data3 = new Data1("C"); // 힙 생성
        System.out.println("C count:" + data3.count);

        // 여기서 각각의 인스턴스를 공유하기 위해서 별도의 Counter class를 만들어준다
    }
}
