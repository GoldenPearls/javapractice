package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println(data1.name + " : " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println(data2.name + " : " + Data3.count);


        Data3 data3 = new Data3("C");
        // 클래스를 통한 접근`
        System.out.println(data3.name + " : " + Data3.count);

        // 인스턴스를 통한 접근 추천 nono
        Data3 data4 = new Data3("D");
        //System.out.println(data4.count);

    }
}
