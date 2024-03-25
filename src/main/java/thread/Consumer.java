package thread;

import java.util.List;

//데이터를 가져와서 소비하는 역할
public class Consumer implements Runnable {
    private List<String> data;
    private int threadId = 0;

    public Consumer(int threadId, List<String> data) {
        this.threadId = threadId;
        //생성자 스레드가 생성한 데이터를 소비하기 위해 공유 변수 data를 입력받아 지역변수에 할당
        this.data = data;
    }

    @Override
    public void run() {
        String myDate;

        while (true) {
            try {
                // 0.1초 쉬기
                Thread.sleep(100);

                //데이터가 비어있지 않은 경우에만 데이터 가져오기
                if (!data.isEmpty()) {
                    //공유 변수의 첫 번 째 배열의 값 가져오기
                    // 소비자 스레드 2개를 가져옴(경쟁상대로 문제가 생기는 것)
                    myDate = data.get(0);

                    //공유 자원에서 가져온 데이터 출력
                    System.out.println("[Thread " + threadId + "} : " + myDate + "번 데이터를 가져옵니다.");

                    //첫 번째 배열 삭제, 소비한 데이터 식제
                    data.remove(0);
                }
            }
            // 예외처리 InterruptedExceptionq이란? 스레드가 sleep()상태에 있을 때 다른 스레드가 인터럽트하면 발생
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}