package proxy;

import strategy.Animal;
import strategy.DoorMan;

//public class DoorManProxy extends DoorMan {
//    public void kick(Animal a) {
//        System.out.println("안녕!");
//        super.kick(a); // 부모인 DoorMan의 kick
//    }
//}


// 상속x -> 컴퍼지션
public class DoorManProxy {
    private DoorMan doorMan;

    public DoorManProxy(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void kick(Animal a) {
        System.out.println("안녕!");
        doorMan.kick(a);
    }
}
