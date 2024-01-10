    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Scanner;

    public class Order {
    private int waitNum = 0; // 대기번호
    private ArrayList<Product> Cart = new ArrayList<>();
    Menu menu;
    public Order(Menu menu) {
        this.menu = menu;
    }

    public double addOrder(Product product) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[ Orders ]");
        for (Product a : Cart) {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("[ Total ]");
        double totalPrice = 0;
        HashSet<Product> totalProductSet = new HashSet<Product>(Cart);
        for (Product item : totalProductSet) {
            totalPrice += item.getPrice(); // 가격계산
        }
        totalPrice = Math.round((totalPrice*100))/100.0; //소수점 둘째자리까지 나타내고 반올림
        System.out.println("W " + totalPrice);
        System.out.println();
        System.out.println("1. 주문     2. 메뉴판");
        completeOrder();
        return totalPrice;
    }
        public int completeOrder() {
            Scanner sc = new Scanner(System.in);
            int orderChoice = sc.nextInt();
            sc.nextLine();

            if (orderChoice == 1) {
                System.out.println();
                System.out.println("주문이 완료되었습니다!\n");
                System.out.println("대기번호는 [ " + waitNum + " ] 번 입니다");
                waitNum++;
                Cart.clear();
                System.out.println("(3초후 메뉴판으로 돌아갑니다.)\n");
                System.out.println("(2초후 메뉴판으로 돌아갑니다.)\n");
                System.out.println("(1초후 메뉴판으로 돌아갑니다.)\n");

                try {
                    Thread.sleep(1000);
                    Thread.sleep(1000);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return waitNum;

        }

    // 주문 취소
    public void cancelOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("진행하던 주문을 취소하시겠습니까?\n");
        System.out.println("1. 확인      2. 취소");

        System.out.print("메뉴를 선택하세요: ");
        int cancelChoice = sc.nextInt();
        if (cancelChoice == 1) {
            Cart.clear();
            System.out.println("진행하던 주문이 취소되었습니다.\n");
        }
        }
    }

    // 장바구니 추가 전 질문
    public void orderQuestion (Product product) {
        Scanner sc = new Scanner(System.in);
        int input;
        product.show();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인          2.취소");
        input = sc.nextInt();
        if (input == 1) { // 장바구니 추가
            System.out.println(product.getName() + "가 장바구니에 추가되었습니다.");
            Cart.add(product);
        } else if (input == 2) {
            System.out.println("장바구니에 추가하지 않았습니다.");
        }
        }