package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
//        생성자는 이와 같이 인스턴스를 생성하고 즉시 해당 생성자를 호출한다. (메서드와 다름)
        MemberConstruct member1 = new MemberConstruct("학생1", 14, 30);

//        성적입력이 필요하지않는 생성자 호출
        MemberConstruct member2 = new MemberConstruct("학생2", 14);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name + "나이:" + member.age + "grade:" + member.grade);
        }
    }
}
