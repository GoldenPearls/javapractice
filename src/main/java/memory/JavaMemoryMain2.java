package memory;

public class JavaMemoryMain2 {
    // 스택과 힙 같이 사용
    public static void main(String[] args) {
        System.out.println("main 시작");
        method1();
        System.out.println("main 끝");
    }
    static void method1() { //Data 클래스의 인스턴스 생성
        System.out.println("method1 시작");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 끝");
    }

    static void method2(Data data2) {
        System.out.println("method2 시작");
        System.out.println("data.value = "+data2.getValue());
        System.out.println("method2 끝");
    }
}
