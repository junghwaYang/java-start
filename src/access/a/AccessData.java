package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

//    모든 접근 가능
    public void publicMethod(){
        System.out.println("publicMethod 호출:" + publicField);
    }

//    같은 패키지에서 접근 가능
    void defaultMethod(){
        System.out.println("defaultField 호출:" + defaultField);
    }

//    class 내부에서만 접근 가능
    private void privateMethod(){
        System.out.println("privateField 호출:" + privateField);
    }

//    내부 호출
    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
