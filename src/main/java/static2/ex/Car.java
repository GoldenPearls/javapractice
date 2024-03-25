package static2.ex;

public class Car {
    public static int buyCarCount = 0;
    String CarName;

    public Car(String CarName){
        this.CarName = CarName;
        buyCarCount++;
        System.out.println("차량 구입, 이름 : " + CarName);
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + buyCarCount);
    }
}
