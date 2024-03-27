package final1;


//final 키워드가 붙으면 더는 값을 변경할 수 없다
public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수 1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //에러 발생

        method(10);
    }

    //final 매개변수로 메서드 내부에서 매개변수의 값을 변경할 수 없다. 즉, 메서드 호출 시점에 사용된 값이 끝까지 사용된다.
    static void method(final int paramete){
        //paramete = 20; //에러 발생
    }
}
