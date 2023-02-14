package proxy;

public class App {
    public static void main(String[] args) {
        strategy.Mouse m = new strategy.Mouse();
        strategy.Cat c = new strategy.Cat();
//        DoorMan dm = new DoorManProxy();
        DoorManProxy dm = new DoorManProxy(new strategy.DoorMan());
        dm.kick(m);
        dm.kick(c);
    }
}
