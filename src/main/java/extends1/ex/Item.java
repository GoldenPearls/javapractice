package extends1.ex;

public class Item {
    String name;
    int price;

    // 생성자
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 메소드
    public void print() {
        System.out.println("이름: " + name + ", 가격:" + price);
    }
}
