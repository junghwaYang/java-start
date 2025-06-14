package classStudy;

public class ClassStart {
    public static void main(String[] args) {
        Student student1;

        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 1. 객체 생성
        student2 = new Student(); // 2. 메모리 어딘가에 참조값 반환
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 90;

        System.out.println("이름:" + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름:" + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

        System.out.println(student1);
        System.out.println(student2);
    }
}
