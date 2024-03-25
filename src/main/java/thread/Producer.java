package thread;

import java.util.List;

public class Producer implements Runnable{
    private List<String> data;

    public Producer(List<String> data) {
        this.data = data;
    }

    @Override
    public void run() {
        // 1부터 10까지 데이터를 만들어서 순차적으로 data에 넣기
        for(int i = 1; i<=10; i++){
            data.add(String.valueOf(i));
        }
    }
}
