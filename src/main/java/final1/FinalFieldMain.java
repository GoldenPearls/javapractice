package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 : 생성자 초기화, 다른값 넣기 가능
        System.out.println("생성자 초기화");
        ConstructInit ci = new ConstructInit(10);
        ConstructInit ci2 = new ConstructInit(20);
        System.out.println(ci.value); //10
        System.out.println(ci2.value); //20

        //final 필드 : 필드 초기화
        // 모든 인스턴스가 같은 값을 사용하기에 결과적으로 메모리 낭비(힙 영역에 같은 값이 여러번 저장됨)
        System.out.println("필드 초기화");
        FieldInit fi = new FieldInit();
        FieldInit f2 = new FieldInit();
        System.out.println(fi.value); //10
        System.out.println(f2.value); //10

        //상수
/*        1. 필드 초기화의 메모리 낭비 및 데이터 중복을 없애기 위한 static 상수
        2. static 영역은 단 하나만 존재하는 영역으로 JVM 상에서 하나만 존재하므로 중복 및 비효율 문제 해결 가능
        3. 메서드 영역인 static 영역에 저장되어 프로그램이 종료될 때까지 유지*/
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE); //10
    }
}
