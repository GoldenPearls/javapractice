package extends1.ex;

public class Movie extends Item{
    String director, actor;

    public Movie(String title, int price, String director, String actor){
        super(title, price);
        this.director = director;
        this.actor = actor;
    }

    public void print(){
        super.print();
        System.out.println("- 감독: " + director +", 배우: " + actor);
    }

    public int getPrice() {
        return price;
    }


}
