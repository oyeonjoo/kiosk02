import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    private Order order = new Order();

//    private ArrayList<Product> BurgerMenu = new ArrayList<Product>(); // 버거 메뉴판
//    private ArrayList<Product> FrozenMenu = new ArrayList<Product>(); // 프로즌 메뉴판
//    private ArrayList<Product> DrinkMenu = new ArrayList<Product>(); // 드링크 메뉴판


    public void run() {
        // 카테고리 메뉴판 출력
//        Menu BurgerMenu = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
//        Menu FrozenCustardMenu = new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림");
//        Menu DrinkMenu = new Menu("Drinks", "매장에서 직접 만드는 음료");
//        CategoryMenu.add(BurgerMenu);
//        CategoryMenu.add(FrozenCustardMenu);
//        CategoryMenu.add(DrinkMenu);
        //CategoryMenu.add(new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"));

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



//    public void display() throws InterruptedException {
//        while (true) {
//            int numbering;          // 번호매김을 위한 변수 numbering 선언 (카테고리나 메뉴 갯수 변경 따른 유동적인 번호부여를 고려하여 numbering 사용)
//            int selectCategoryNum;  // 카테고리메뉴판에서 선택한 카테고리번호, 버거 or 쉐이크 or 음료
//            int selectProductNum;   // 상품메뉴판에서 선택한 상품번호
//
//            //(1)카테고리 메뉴판
//            numbering = showMenu();                                     //1. 카테고리메뉴판 보여주기(번호매김 후 숫자 값 리턴)
//            //ShowOption(numbering);                                      //옵션메뉴(order/cancel) 보여주기 (order/cancel에 부여할 동적 번호를 인자값으로 전달)
//            selectCategoryNum = getResponse(numbering, CategoryMenu);   //사용자 응답.사용자 응답에 따른 결과를 전달받음
//
//            if (selectCategoryNum >= numbering || selectCategoryNum == 0) {                       //order/cancel 번호 또는 옵션(0) 선택하였을 경우  : 초기로 돌아가기
//                continue;
//            }
//            //(2)상세 메뉴판
//            numbering = showMenu(selectCategoryNum);                     //2.선택카테고리의 메뉴판 보여주기 (번호매김 후 숫자 값 리턴)
//            showOption(numbering);                                       //옵션메뉴(order/cancel) 보여주기 (order/cancel에 부여할 동적 번호를 인자값으로 전달)
//            selectProductNum = getResponse(numbering, CategoryProduct); //사용자 응답. 응답에 따라 메뉴추가 또는 order/cancel
//
//            if (selectProductNum >= numbering || selectCategoryNum == 0) {                         //order/cancel 번호를 선택하였을 경우  : 초기로 돌아가기
//                continue;
//            }
//             order.addOrder(CategoryProduct.get(selectProductNum - 1)); //선택한 상품 객체를 Addorder메서드의 인자값으로 전달
//        }
//    }
//
//    public int showMenu() { //메뉴판
//        int numbering = 1;
//        System.out.println("\"SHAKESHACK BURGER 에 오신 걸 환영합니다.\"");
//        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
//        System.out.println("[ SHAKESHACK MENU ]");
//        for (Menu item : CategoryMenu) { // 카테고리 보여주기 categoryMenu -  Arraylist.
//            System.out.print(numbering + ". ");//번호매김 1. 2. 3. (카테고리 추가를 고려하여 numbering 사용)
//            item.show();
//            numbering++;
//        }
//        return numbering;
//    }
//
//    public int showMenu(int selectCategoryNum) { //상품메뉴판. 선택카테고리에 대한 ShowMenu()
//        int numbering = 1;
//        String menuName;
//        CategoryProduct.clear(); // 이전 카테고리메뉴가 남아 있을 시 지우기
//        System.out.println("\"SHAKESHACK BURGER 에 오신 걸 환영합니다.\"");
//        System.out.println("아래 상품 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
//        menuName = CategoryMenu.get(selectCategoryNum - 1).getName(); //선택한 카테고리명 가져오기
//        System.out.println("[ " + menuName + " MENU ]");
//        for (Product item : AllProducts) { //전체 상품에서 선택한 카테고리의 상품들을 뽑아오기
//            if (menuName.equals(item.getCategory())) {
//                CategoryProduct.add(item);
//                System.out.print(numbering + ". ");
//                item.show();
//                numbering++;
//                System.out.println("[ ORDER MENU ]");
//                System.out.printf(numbering + ". %-15s | %s\n", "Order", "장바구니를 확인 후 주문을 완료합니다.");
//                System.out.printf(numbering + 1 + ". %-15s | %s\n", "Cancel", "진행중인 주문을 취소합니다.");
//
//            }
//
//        }
//        return numbering;
//
//
//    }
//    public void showOption(int numbering) { //옵션 메뉴
//        System.out.println("[ ORDER MENU ]");
//        System.out.printf(numbering + ". %-15s | %s\n", "Order", "장바구니를 확인 후 주문을 완료합니다.");
//        System.out.printf(numbering + 1 + ". %-15s | %s\n", "Cancel", "진행중인 주문을 취소합니다.");
//    }
//
//    //<T extends Menu> : 어떤타입 T 인자로 받을 종류는 Menu클래스 이거나, 상속받은 하위타입만 받을 수 있다.
//    //즉 Menu의 자식관계에 있는 Product도 같은 메서드에 접근할 수 있다.
//    public <T extends Menu> int getResponse(int numbering, ArrayList<T> list) throws InterruptedException { // 응답을 받고 처리하는 메서드
//        int input;    // 리턴받을 사용자 응답(1 or 2 or 3 or ...)
//        int optionInput; // 옵션 응답과 나누어 별도 저장
//        double totalPrice;
//        Scanner sc = new Scanner(System.in); // 사용자 응답을 받기 위한 Scanner
//        input = sc.nextInt();
//        if (1 <= input && input < numbering) { //카테고리 범위 내 번호 선택 시 - select
//            System.out.println(list.get(input - 1).getName() + " 선택하셨습니다.");
//        } else if (input == numbering) { // Order주문하기 선택 시
//            System.out.println("아래와 같이 주문하시겠습니까?");
//            System.out.println("[ Orders ]");
//            totalPrice = order.getCart(); //장바구니에 담긴 내용물을 보여주고, 총가격 리턴받음
//            System.out.println("[ Total ]");
//            System.out.println("W " + totalPrice + "\n");
//            System.out.println("1. 주문     2. 메뉴판");
//            optionInput = sc.nextInt();
//            if (optionInput == 1 && totalPrice !=0) {
//                System.out.println("주문이 완료되었습니다!");
//                System.out.println("대기번호는 [ " + order.completeOrder() + " ]번 입니다."); // 장바구니를 비우고, 대기번호 리턴받음
//                //revenue +=totalPrice; // 주문한 가격만큼 수익에 계산
//                System.out.println("(3초 후 초기 메뉴판으로 돌아갑니다.)");
//                Thread.sleep(1000);
//                System.out.println("(2초 후 초기 메뉴판으로 돌아갑니다.)");
//                Thread.sleep(1000);
//                System.out.println("(1초 후 초기 메뉴판으로 돌아갑니다.)");
//                Thread.sleep(1000);
//            } else if (optionInput == 2) {
//                System.out.println("주문이 완료되지 않았습니다.");
//                System.out.println("(초기 메뉴판으로 돌아갑니다.)");
//                Thread.sleep(500);
//            }
//            else if(totalPrice==0){
//                System.out.println("주문하신 내용이 없습니다.");
//                System.out.println("(초기 메뉴판으로 돌아갑니다.)");
//                Thread.sleep(500);
//            }
//        } else if (input == numbering + 1) { // Cancel취소하기 선택시
//            System.out.println("진행하던 주문을 취소하겠습니까?");
//            System.out.println("1. 확인     2. 취소");
//            optionInput= sc.nextInt();
//            if (optionInput == 1) {
//                order.cancelOrder();
//                System.out.println("진행하던 주문이 취소되었습니다. 이전 화면으로 돌아갑니다.");
//                Thread.sleep(500);
//            }
//            if (optionInput == 2) {
//                System.out.println("주문이 취소되지 않았습니다. 이전 화면으로 돌아갑니다.");
//                Thread.sleep(500);
//            }
//        }
////        else if (input == 0) { //옵션 기능 선택 시
////            System.out.println("[ 총 판매금액 현황 ]");
////            System.out.println("현재까지 총 판매된 금액은 [ W "+Math.round((revenue*100))/100.0 +"] 입니다.\n"); //소수점 둘째자리까지 나타내고 반올림 ( 자바는 IEEE 754 부동 소수점 방식 - 근사치 제공에 의해 소수 오차 발생 방지)
////            //order.SoldList();
////            while(true) {
////                System.out.println("1. 돌아가기");
////                optionInput = sc.nextInt();
////                if (optionInput == 1) {
////                    System.out.println("이전 화면으로 돌아갑니다.");
////                    break;
////                }
////                else{
////                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
////                }
////            }
////        }
//
//        return input;//선택한 번호 전달
//    }
}