package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("child.value : " + child.value);
        child.method();
        child.method2();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent.value : " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조
        Parent parentChild = new Child();
        System.out.println("Parent -> Child");
        System.out.println("parentChild.value : " + parentChild.value);
        parentChild.method(); //메소드 오버라이딩으로 자식 호출
        parentChild.method2(); //부모 메소드 호출


    }
}
