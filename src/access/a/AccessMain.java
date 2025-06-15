package access.a;

public class AccessMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
//        public
        accessData.publicField = 1;
        accessData.publicMethod();
//        default
        accessData.defaultField = 2;
        accessData.defaultMethod();
//        private(에러 발생!)
//        accessData.privateField = 3;
//        accessData.privateMethod();

        accessData.innerAccess();
    }
}
