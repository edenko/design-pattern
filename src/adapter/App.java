package adapter;

import adapter.Cat;
import adapter.DoorMan;
import adapter.Mouse;
/*
* 어댑터 패턴
* : 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우 -> faker adapter 생성해서 진행해보세요.
* : 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우 -> 실습
* */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();

//        OuterTiger ot = new OuterTiger();
        TigerAdapter ot = new TigerAdapter(new OuterTiger());
        DoorMan dm = new DoorMan();
        dm.kick(m);
        dm.kick(c);
        dm.kick(ot);
    }
}
