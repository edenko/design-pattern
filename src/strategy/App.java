package strategy;

import proxy.Cat;
import proxy.DoorMan;
import proxy.DoorManProxy;
import proxy.Mouse;

public class App {
    public static void main(String[] args) {
        proxy.Mouse m = new Mouse();
        proxy.Cat c = new Cat();
        proxy.DoorMan dm = new DoorMan();
        dm.kick(m);
        dm.kick(c);
    }
}
