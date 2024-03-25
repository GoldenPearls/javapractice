package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {
    public static void main(String[] args) {
        //공유 자원 생성
        List<String> data = new ArrayList<String>();

        // 스레드 생성
        // Producer
        Thread producer = new Thread(new Producer(data));

        Thread consumerThread1 = new Thread(new Consumer(1, data));
        Thread consumerThread2 = new Thread(new Consumer(2, data));

        //스레드 실행
        producer.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
