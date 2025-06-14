package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = initStudent("학생1", 15,90);
        System.out.println("student1:"+student1.name+student1.age+student1.grade);

        Student student2 = initStudent("학생2", 15,100);
        System.out.println("student2:"+student2.name+student2.age+student2.grade);
    }

    static  Student initStudent(String name, int age, int grade){
        Student student = new Student();
        System.out.println("student:"+student);
        student.name=name;
        student.age=age;
        student.grade=grade;
        return student;
    }
}
