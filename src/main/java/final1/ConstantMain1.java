package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        // System.out.println("프로그램 최대 참여자 수 "+1000);
        // 확장성을 위해 상수를 이용
        System.out.println("프로그램 최대 참여자 수 "+Constant.MAX_USERS);
        int currentUserCouunt = 999;
        process(currentUserCouunt++);
        process(currentUserCouunt++);
        process(currentUserCouunt++);
    }

    private static void process(int currentUserCouunt) {
        System.out.println("참여자 수 "+currentUserCouunt);
        if(currentUserCouunt > Constant.MAX_USERS){
            System.out.println("대기자로 등록합니다. ");
        }
        else{
            System.out.println("게임에 참가합니다.");
        }
    }
}
