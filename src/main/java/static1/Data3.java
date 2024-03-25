package static1;

//기존 코드 유지를 위한 새로운 클래스
public class Data3 {
    public String name;
    // 클래스를 따로 빼서 만드는 대신 static 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있음
    // 정적 변수, 클래스 변수(static 변수)는 클래스가 메모리에 올라갈 때 생성되어 프로그램이 종료될 때까지 유지됨
    // 멤버 변수에는 두 개가 있음 1. 클래스 변수 2. 인스턴스 변수
    public static int count; //static
    
    public Data3(String name){
        this.name = name;
        count++;
    }
}
