package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //instanceValue++; 인스턴스 변수 접근 compile error
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 호출
    }

    public static void staticCall2(DecoData data) {
        data.instanceValue++; //객체의 참조값을 직접 매개변수로 전달하여 가능
        //instanceValue++;//인스턴스 변수 접근 compile error static은 객체의 참조값이 없어서 인스턴스 변수 변수나 메서드 사용 불가
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 호출
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메소드 호출
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 호출
    }

    private void instanceMethod(){
        System.out.println("instanceValue="+instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }
}
