package ch7;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
class Product {
    private int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer {
    private int money = 1000;
    private Product[] cart = new Product[3];
    private int i = 0;

    void buy(Product p) {
        if (money < p.getPrice()) {
            return;
        }

        add(p);
        money -= p.getPrice();
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] newCart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            cart = newCart;
        }

        cart[i++] = p;
    }

    void summary() {
        System.out.print("구입한 물건 : ");

        for (int j = 0; j < cart.length; j++) {
            System.out.print(cart[j] + ",");
        }
        System.out.println();

        System.out.println("사용한 금액 : " + (1000-money));
        System.out.println("남은 금액 : " + money);
    }
}