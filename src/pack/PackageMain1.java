package pack;

import pack.a.User; // import로 다른 경로 패키지 호출
//import pack.a.*; // 모든 형태 호출

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        pack.b.User userB = new pack.b.User();
    }
}
