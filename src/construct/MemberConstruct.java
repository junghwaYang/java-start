package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

//    생성자: 생성자는 반환 타입이 없음
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name:"+name+"나이:"+age+"grade:"+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
