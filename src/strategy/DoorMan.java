package strategy;

public class DoorMan {
    public void kick(Animal a) {
//        System.out.println("안녕"); -> OCP를 지키지 못함, 기존 코드를 수정했으니까 -> DoorManProxy 생성
        System.out.println(a.getName() + " 쫒아내");
    }
}
