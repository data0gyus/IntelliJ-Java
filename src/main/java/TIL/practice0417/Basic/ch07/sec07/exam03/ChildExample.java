package TIL.practice0417.Basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // 객체 생성 및 자동 타입 변환
        Parent parent = new Child();

        // Parent 타입으로 필드와 메서드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();


        //parent.field2 = "data2"; // 불가능 -> Parent 타입에는 filed2가 없음
        //parent.method3();        // 불가능 -> Parent 타입에는 method3()이 없음

        // 강제 타입 변환
        Child child = (Child) parent;

        // Child 타입으로 필드와 메서드 사용
        child.field2 = "data2";
        child.method3();
    }
}
