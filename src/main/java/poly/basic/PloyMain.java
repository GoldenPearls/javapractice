package poly.basic;

public class PloyMain {
    //다형적 탐조 : 부모는 자식을 품을 수 있다
    public static void main(String[] args){
        //부모 변수가 부모 인스턴스 참고
        Parent parent = new Parent();
        parent.parentMehtod();

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조
        Parent p = new Child();
        p.parentMehtod();

        //p.childMethod(); //부모타입은 자식의 멤버에 접근 불가

        //다운 캐스팅 참고로 캐스팅한다고 해서 Parent p의 타입이 변하는 것은 아님
        //참조값을 꺼내고 꺼낸 참조값이 Child 타입이 되는 것
        Child child1= (Child) p;
        child1.childMethod();

        //일시적 다운 캐스팅
        ((Child)p).childMethod();
    }
    private static void call(Parent p){
        p.parentMehtod();
        if(p instanceof Child){ // instanceof : p가 Child 타입이 맞는지 확인
            System.out.println("자식 클래스로 캐스팅 가능");
            ((Child)p).childMethod();
        }
    }
}
