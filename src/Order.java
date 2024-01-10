    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.Scanner;

public class Order {
    private int waitNum = 1; // 대기번호
    private final ArrayList<Product> cart = new ArrayList<>();

    public void addOrder() {
        if(!cart.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("아래와 같이 주문 하시겠습니까?\n");
            System.out.println("[ Orders ]");

            for (Product a : cart) {
                System.out.println(a);
            }
            System.out.println();
            System.out.println("[ Total ]");
            double totalPrice = 0;
            HashSet<Product> totalProductSet = new HashSet<Product>(cart);
            for (Product item : totalProductSet) {
                totalPrice += item.getPrice(); // 가격계산
            }
            totalPrice = Math.round((totalPrice * 100)) / 100.0; //소수점 둘째자리까지 나타내고 반올림
            System.out.println("W " + totalPrice);
            System.out.println();
            System.out.println("1. 주문     2. 메뉴판");
            completeOrder();
        }
    }
    public void completeOrder() {
        Scanner sc = new Scanner(System.in);
        int orderChoice = sc.nextInt();
        sc.nextLine();

        if (orderChoice == 1) {
            System.out.println();
            System.out.println("주문이 완료되었습니다!\n");
            System.out.println("대기번호는 [ " + waitNum + " ] 번 입니다");
            waitNum++;
            cart.clear();
            System.out.println("(3초후 메뉴판으로 돌아갑니다.)\n");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 주문 취소
    public void cancelOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("진행하던 주문을 취소하시겠습니까?\n");
        System.out.println("1. 확인      2. 취소");

        int cancelChoice = sc.nextInt();
        if (cancelChoice == 1) {
            cart.clear();
            System.out.println("진행하던 주문이 취소되었습니다.\n");
        } else System.out.println("메뉴로 돌아갑니다.");
    }

    // 장바구니 추가 전 질문
    public void orderQuestion(Product product) {
        Scanner sc = new Scanner(System.in);
        int input;
        product.show();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인          2.취소");
        input = sc.nextInt();
        if (input == 1) { // 장바구니 추가
            System.out.println(product.getName() + "가 장바구니에 추가되었습니다.");
            cart.add(product);
        } else if (input == 2) {
            System.out.println("장바구니에 추가하지 않았습니다.");
        }
    }
}