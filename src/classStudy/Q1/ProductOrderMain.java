package classStudy.Q1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder prod1 = new ProductOrder();
        prod1.productName = "두부";
        prod1.price = 2000;
        prod1.quantity = 2;

        ProductOrder prod2 = new ProductOrder();
        prod2.productName = "김치";
        prod2.price = 5000;
        prod2.quantity = 1;

        ProductOrder prod3 = new ProductOrder();
        prod3.productName = "콜라";
        prod3.price = 1500;
        prod3.quantity = 2;

        ProductOrder[] products = new ProductOrder[]{prod1, prod2, prod3};

        int totalPricce = 0;
        for (int i = 0; i < products.length; i++) {
            System.out.println("상품명:" + products[i].productName + ", 가격:" + products[i].price + ", 주문 수량:" + products[i].quantity);
            totalPricce += products[i].price * products[i].quantity;
        }
        System.out.println("총 결제 금액:" + totalPricce);


    }
}
