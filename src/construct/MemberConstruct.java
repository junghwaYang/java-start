package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

//    생성자: 생성자는 반환 타입이 없음
//    성적 입력이 필요한 경우의 생성자
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name:"+name+"나이:"+age+"grade:"+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
//    그렇지않은 경우의 생성자(생성자 오버로딩)
    MemberConstruct(String name, int age){
        this(name, age, 50); // this는 제일 위쪽에 선언되어야한다.
    }
}
