package product;

import java.awt.*;

public class FrozenCustard extends Menu{
    Menu menu;
    private double price;

    public FrozenCustard(Menu menu, double price) {
        this.menu = menu;
        this.price = price;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
