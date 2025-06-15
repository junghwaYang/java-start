package static1;

public class Data2 {
    // 예제니까 public으로 명명
    public String name;

    public Data2(String name, Counter count) {
        this.name = name;
        count.count++;
    }
}
