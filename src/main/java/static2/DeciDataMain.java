package static2;

// 정적 메서드를 자주 사용 시 클래스 명 생략 할 수 있는 방법
import static static2.DecoData.*;

public class DeciDataMain {
    public static void main(String[] args) { //객체를 생성하지 않아도 실행되는 이유 static 메서드
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
