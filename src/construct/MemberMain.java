package construct;

public class MemberMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("철수", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("영희", 13, 100);

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit memberInit : memberInits) {
            System.out.println("이름:"+memberInit.name+" 나이:"+memberInit.age+" 성적:"+ memberInit.grade);
        }
    }

}
