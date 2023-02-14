package proxy;

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
//        DoorMan dm = new DoorManProxy();
        DoorManProxy dm = new DoorManProxy(new DoorMan());
        dm.kick(m);
        dm.kick(c);
    }
}
