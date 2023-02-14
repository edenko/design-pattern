package strategy;

import strategy.Cat;
import strategy.DoorMan;
import strategy.Mouse;

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();
        dm.kick(m);
        dm.kick(c);
    }
}
