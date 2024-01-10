import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    private ArrayList<Product> Cart = new ArrayList<>();
    private ArrayList<Product> BurgerMenu = new ArrayList<Product>(); // 버거 메뉴판
    private ArrayList<Product> FrozenMenu = new ArrayList<Product>(); // 프로즌 메뉴판
    private ArrayList<Product> DrinkMenu = new ArrayList<Product>(); // 드링크 메뉴판
    private Menu menu;
    private Order order = new Order();

    public void welcome() {
        String info = "\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n"  +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.";

        System.out.println(info);
    }
    public void printCategory() {

        String category =  "[ SHACKSHACK MENU ]\n"
                + "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n"
                + "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n"
                + "3. Drinks          | 매장에서 직접 만드는 음료\n"
                + "[ ORDER MENU ]\n"
                + "4. Order       | 장바구니를 확인 후 주문합니다.\n"
                + "5. Cancel      | 진행중인 주문을 취소합니다.\n";

        System.out.println(category);
    }

    public void displayMenu() {
        // 버거 메뉴
        BurgerMenu.add(new Product("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        BurgerMenu.add(new Product("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        BurgerMenu.add(new Product("Burger", 9.4,"몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        BurgerMenu.add(new Product("Cheeseburger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        // 프로즌 메뉴
        FrozenMenu.add(new Product("Shakes", 5.9,"바닐라, 초콜렛, 스트로베리"));
        FrozenMenu.add(new Product("ShakeOfTheWeek", 6.5,"특별한 커스터드 플레이버"));
        FrozenMenu.add(new Product("Floats", 5.9,"루트 비어, 퍼플 카우, 크림시클"));

        // 드링크 메뉴
        DrinkMenu.add(new Product("Soda", 3.0,"코카콜라, 코카콜라 제로, 스프라이트"));
        DrinkMenu.add(new Product("IcedTea", 3.5,"직접 유기농 홍차를 우려낸 아이스티"));
        DrinkMenu.add(new Product("BottledWater", 1.0,"지리산 암반대수층으로 만든 프리미엄 생수"));
    }
    public void run() {
        welcome(); // 고정 msg
        printCategory(); // 카테고리 선택 msg
        System.out.print("메뉴를 선택하세요 : ");

        Scanner sc = new Scanner(System.in);
        int menuChoice = sc.nextInt();
        sc.nextLine();

        while(true) {
            if (menuChoice == 1) { // 버거 선택
                welcome(); // 고정 msg
                System.out.println("[ Burgers MENU ]");

                for (int i = 0; i < BurgerMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + BurgerMenu.get(i));
                }
                System.out.println("메뉴를 선택하세요: ");
                burgerAddQuestion(); // 장바구니에 추가할 건지
            } else if (menuChoice == 2) { // 프로즌 선택
                welcome(); // 고정 msg
                System.out.println("[ FrozenCustard MENU ]");

                for (int i = 0; i < FrozenMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + FrozenMenu.get(i));
                }
                System.out.println("메뉴를 선택하세요: ");
                frozenAddQuestion(); // 장바구니에 추가할 건지
            } else if (menuChoice == 3) { // 드링크 선택
                welcome(); // 고정 msg
                System.out.println("[ Drink MENU ]");

                for (int i = 0; i < DrinkMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + DrinkMenu.get(i));
                }
                System.out.println("메뉴를 선택하세요: ");
                drinkAddQuestion(); // 장바구니에 추가할 건지
            } else if (menuChoice == 4) { // 주문하기 선택

                    order.addOrder();

            } else if (menuChoice == 5) { // 취소
                order.cancelOrder();
            } else System.out.println("다시 선택하세요.");
            run();
        }
    }

    public void burgerAddQuestion() {
        Scanner sc = new Scanner(System.in);
        int burgerChoice = sc.nextInt();
        if (burgerChoice < 5) {
            order.orderQuestion(BurgerMenu.get(burgerChoice-1));
        } else System.out.println("다시 선택하세요.");
    }

    public void frozenAddQuestion() {
        Scanner sc = new Scanner(System.in);
        int frozenChoice = sc.nextInt();
        if (frozenChoice < 5) {
            order.orderQuestion(FrozenMenu.get(frozenChoice-1));
        } else System.out.println("다시 선택하세요.");
    }

    public void drinkAddQuestion() {
        Scanner sc = new Scanner(System.in);
        int drinkChoice = sc.nextInt();
        if (drinkChoice < 5) {
            order.orderQuestion(DrinkMenu.get(drinkChoice-1));
        } else System.out.println("다시 선택하세요.");
    }
}