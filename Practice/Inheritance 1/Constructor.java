
class Base {
    int x;

    Base() {
        System.out.println("Constructor ");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y ;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(40);
        System.out.println(d.getX());
    }

}  