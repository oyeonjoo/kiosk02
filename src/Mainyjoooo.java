import java.util.ArrayList;
import java.util.Scanner;

public class Mainyjoooo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String info = "\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n";

        ArrayList<String> Menu = new ArrayList<>();
        Menu.add("Burgers         | 앵거스 비프 통살을 다져만든 버거");
        Menu.add("Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
        Menu.add("Drinks          | 매장에서 직접 만드는 음료\n");

        ArrayList<String> BurgerMenu = new ArrayList<>();
        BurgerMenu.add("ShackBurger       | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        BurgerMenu.add("SmokeShack        | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        BurgerMenu.add("Shroom Burger     | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        BurgerMenu.add("Cheeseburger      | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");

        ArrayList<String> FrozenCustardMenu = new ArrayList<>();
        FrozenCustardMenu.add("Shakes            | W 5.9 | 바닐라, 초콜렛, 스트로베리");
        FrozenCustardMenu.add("Shake of the Week | W 6.5 | 특별한 커스터드 플레이버");
        FrozenCustardMenu.add("Floats            | W 5.9 | 루트 비어, 퍼플 카우, 크림시클");

        ArrayList<String> DrinkMenu = new ArrayList<>();
        //DrinkMenu.add("[ Drinks MENU ]");
        DrinkMenu.add("Soda              | W 3.0 | 코카콜라, 코카콜라 제로, 스프라이트");
        DrinkMenu.add("Iced Tea          | W 3.5 | 직접 유기농 홍차를 우려낸 아이스티");
        DrinkMenu.add("Bottled Water     | W 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수");

        ArrayList<String> Cart = new ArrayList<>();

        int waitNum = 1;

        while (true) {
            System.out.println(info);

            System.out.println("[ SHACKSHACK MENU ]");
            for (int i = 0; i < Menu.size(); i++) {
                System.out.println((i + 1) + ". " + Menu.get(i));
            }

            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Order       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel      | 진행중인 주문을 취소합니다.\n");

            System.out.print("메뉴를 선택하세요: ");
            int menuChoice = sc.nextInt();
            sc.nextLine();
            System.out.println();
            // 메뉴 카테고리 선택
            if (menuChoice == 1) {
                System.out.println(info);
                System.out.println("[ Burgers MENU ]");

                for (int i = 0; i < BurgerMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + BurgerMenu.get(i));
                }
                System.out.println("메뉴를 선택하세요: ");
                // 버거 종류 선택
                int burgerChoice = sc.nextInt();
                if (burgerChoice == 1) {
                    System.out.println(
                            "\"" + BurgerMenu.get(0) + "\"" +
                                    "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                    "1. 확인        2. 취소");
                    // 주문 확인
                    int cartChoice = sc.nextInt();
                    if (cartChoice == 1) {
                        System.out.println(BurgerMenu.get(0) + " 가 장바구니에 추가되었습니다.\n");
                        Cart.add(BurgerMenu.get(0));
                        System.out.println();
                    }
                } else if (burgerChoice == 2) {
                    System.out.println(
                            "\"" + BurgerMenu.get(1) + "\"" +
                                    "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                    "1. 확인        2. 취소");
                    // 주문 확인
                    int cartChoice = sc.nextInt();
                    if(cartChoice == 1) {
                        System.out.println(BurgerMenu.get(1) + " 가 장바구니에 추가되었습니다.\n");
                        Cart.add(BurgerMenu.get(1));
                        System.out.println();
                    }
                } else if (burgerChoice == 3) {
                    System.out.println(
                            "\"" + BurgerMenu.get(2) + "\"" +
                                    "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                    "1. 확인        2. 취소");
                    // 주문 확인
                    int cartChoice = sc.nextInt();
                    if(cartChoice == 1) {
                        System.out.println(BurgerMenu.get(2) + " 가 장바구니에 추가되었습니다.\n");
                        Cart.add(BurgerMenu.get(2));
                        System.out.println();
                    }
                } else if (burgerChoice == 4) {
                    System.out.println(
                            "\"" + BurgerMenu.get(3) + "\"" +
                                    "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                    "1. 확인        2. 취소");
                    // 주문 확인
                    int cartChoice = sc.nextInt();
                    if (cartChoice == 1) {
                        System.out.println(BurgerMenu.get(3) + " 가 장바구니에 추가되었습니다.\n");
                        Cart.add(BurgerMenu.get(3));
                        System.out.println();
                    }
                }
            } else if (menuChoice == 2) {
                System.out.println(info);
                System.out.println("[ FrozenCustard MENU ]");

                for (int i = 0; i < FrozenCustardMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + FrozenCustardMenu.get(i));
                }
                System.out.println("메뉴를 선택하세요: ");
                // 쉐이크 종류 선택
                int frozenChoice = sc.nextInt();
                if (frozenChoice == 1) {
                    System.out.println(
                            "\"" + FrozenCustardMenu.get(0) + "\"" +
                                    "\n위 메뉴를 장바구니에 추가하시겠습니까?" +
                                    "1. 확인        2. 취소");
                    // 주문 확인
                    int cartChoice = sc.nextInt();
                    if (cartChoice == 1) {
                        System.out.println(FrozenCustardMenu.get(0) + " 가 장바구니에 추가되었습니다.\n");
                        Cart.add(FrozenCustardMenu.get(0));
                        System.out.println();
                    }
                } else if (frozenChoice == 2) {
                    System.out.println(
                            "\"" + FrozenCustardMenu.get(1) + "\"" +
                                    "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                    "1. 확인        2. 취소");
                    // 주문 확인
                    int cartChoice = sc.nextInt();
                    if (cartChoice == 1) {
                        System.out.println(FrozenCustardMenu.get(1) + " 가 장바구니에 추가되었습니다.\n");
                        Cart.add(FrozenCustardMenu.get(1));
                        System.out.println();
                    }
                } else if (frozenChoice == 3) {
                    System.out.println(
                            "\"" + FrozenCustardMenu.get(2) + "\"" +
                                    "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                    "1. 확인        2. 취소");
                    // 주문 확인
                    int cartChoice = sc.nextInt();
                    if (cartChoice == 1) {
                        System.out.println(FrozenCustardMenu.get(2) + " 가 장바구니에 추가되었습니다.\n");
                        Cart.add(FrozenCustardMenu.get(2));
                        System.out.println();
                    }
                }
            } else if (menuChoice == 3) {
                    System.out.println(info);
                    System.out.println("[ Drink MENU ]");

                    for (int i = 0; i < DrinkMenu.size(); i++) {
                        System.out.println((i + 1) + ". " + DrinkMenu.get(i));
                    }
                    System.out.println("메뉴를 선택하세요: ");
                    // 음료 종류 선택
                    int drinkChoice = sc.nextInt();
                    if (drinkChoice == 1) {
                        System.out.println(
                                "\"" + DrinkMenu.get(0) + "\"" +
                                        "\n위 메뉴를 장바구니에 추가하시겠습니까?/n" +
                                        "1. 확인        2. 취소");
                        // 주문 확인
                        int cartChoice = sc.nextInt();
                        if (cartChoice == 1) {
                            System.out.println(DrinkMenu.get(0) + " 가 장바구니에 추가되었습니다.\n");
                            Cart.add(DrinkMenu.get(0));
                            System.out.println();
                        }
                    } else if (drinkChoice == 2) {
                        System.out.println(
                                "\"" + DrinkMenu.get(1) + "\"" +
                                        "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                        "1. 확인        2. 취소");
                        // 주문 확인
                        int cartChoice = sc.nextInt();
                        if (cartChoice == 1) {
                            System.out.println(DrinkMenu.get(1) + " 가 장바구니에 추가되었습니다.\n");
                            Cart.add(DrinkMenu.get(1));
                            System.out.println();
                        }
                    } else if (drinkChoice == 3) {
                        System.out.println(
                                "\"" + DrinkMenu.get(2) + "\"" +
                                        "\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                                        "1. 확인        2. 취소");
                        // 주문 확인
                        int cartChoice = sc.nextInt();
                        if (cartChoice == 1) {
                            System.out.println(DrinkMenu.get(2) + " 가 장바구니에 추가되었습니다.\n");
                            Cart.add(DrinkMenu.get(2));
                            System.out.println();
                        }
                    }
            } else if (menuChoice == 4) {
                    System.out.println("아래와 같이 주문 하시겠습니까?\n");
                    System.out.println("[ Orders ]");
                    for (String a : Cart) {
                        System.out.println(a);
                    }
                    System.out.println();

                    System.out.println("[ Total ]");
                    double total = 0;
                    for (int i = 0; i < Cart.size(); i++) {
                        String cash = Cart.get(i).substring(22, 25);

                        Double money = Double.parseDouble(cash);
                        total += money;
                    }
                    System.out.println("W " + total);
                    System.out.println();
                    System.out.println("1. 주문     2. 메뉴판");

                    System.out.print("메뉴를 선택하세요: ");
                    int orderChoice = sc.nextInt();
                    sc.nextLine();

                    if (orderChoice == 1) {
                        System.out.println();
                        System.out.println("주문이 완료되었습니다!\n");
                        System.out.println("대기번호는 [ " + waitNum + " ] 번 입니다");
                        waitNum++;
                        Cart.clear();
                        System.out.println("(3초후 메뉴판으로 돌아갑니다.)\n");

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            } else if (menuChoice == 5) {
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
}
}