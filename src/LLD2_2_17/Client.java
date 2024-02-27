package LLD2_2;

public class Client {
    public static void main(String[] args) {

        sparrow s = new sparrow();
        s.fly();

        s.setFlyator(new FastFlyator());
        s.fly();

        s.setFlyator(new SlowFlyator());
        s.fly();
    }
}
