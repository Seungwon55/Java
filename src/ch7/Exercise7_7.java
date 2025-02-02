package ch7;

public class Exercise7_7 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("x : " + c.getX());
    }
}

class P {
    int x = 100;

    P() {
        this(200);
    }

    P(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class C extends P {
    int x = 3000;

    C() {
        this(1000);
    }

    C(int x) {
        this.x = x;
    }
}