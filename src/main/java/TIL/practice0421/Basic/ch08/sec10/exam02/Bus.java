package TIL.practice0421.Basic.ch08.sec10.exam02;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void checkFare(){
        System.out.println("승차 요금을 확인합니다.");
    }
}
