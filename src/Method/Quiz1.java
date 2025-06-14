package Method;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int total = 0;

        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료 ");
            int option = scanner.nextInt();

            if(option == 1){
                // 아래는 버퍼 클리어
                // 버퍼는 데이터를 임시로 저장하는 메모리 공간인데, 위 option에서 사용자가 "1"을 입력 후 엔터를 누르게 된다면
                // 입력된 값이 "1"과 "\n" 이 입력된다.
                // "1"은 사용이 되었고 "\n"이 남게 되는데, 아래 scanner.nextLine();으로 버퍼 클리어를 해주지않으면,
                // 기존에 남아있는 "\n"을 prodName에 할당 시킴으로써 상품명 다음 입력할 수 있게 나오는것이 아닌
                // "상품명을 입력하세요: "
                // "상품의 가격을 입력 하세요: "
                // 이런식으로 바로 넘어가게 된다. 즉, 버퍼 클리어를 안시켜준다면 prodName의 값은 "" 이렇게 빈 문자열이 되기 때문에 꼭 버퍼 클리어를 해주어야한다.
                scanner.nextLine();

                System.out.println("상품명을 입력 하세요: ");
                String prodName = scanner.nextLine();

                System.out.println("상품의 가격을 입력 하세요: ");
                int price = scanner.nextInt();

                System.out.println("구매 수량을 입력 하세요: ");
                int quantity = scanner.nextInt();

                total += price * quantity;

                System.out.println("상품명: "+ prodName + " 가격: " + price + "  합계: " + price * quantity);

            }else if(option == 2){
                System.out.println("총 비용: " + total);
                total = 0;
            }else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }
}
