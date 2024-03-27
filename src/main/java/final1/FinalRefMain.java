package final1;

//final는 변수의 값을 변경할 수 x 그렇다면 변수의 값이란?
public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // 참조형 변수의 경우 참조값 변경 불가
        //data = new Data();

        // 참조형 변수의 경우 value의 값은 변경 가능 즉, 참조의 대상은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        // 기본형 변수
        final int value = 10;
        // 기본형 변수의 경우 값 변경 불가
        //value = 20;
    }
}
