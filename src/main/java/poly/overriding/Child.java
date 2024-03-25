package poly.overriding;

public class Child extends Parent{
    public String value = "자식의 필드";

    @Override
    public void method(){
        System.out.println("자식의 메소드");
    }

    public void newmethod() {
        System.out.println("부모에는 없는 메소드");
    }
}
