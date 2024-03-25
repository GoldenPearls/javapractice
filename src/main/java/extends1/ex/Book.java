package extends1.ex;

public class Book extends Item{
    String author, isbn;

    public Book(String name, int price, String isbn, String  author) {
        super(name, price);
        this.isbn = isbn;
        this.author =author;
    }

    public void print(){
        super.print();
        System.out.println("- 저자: " + author +", isbn: " + isbn);
    }

    public int getPrice() {
        return price;
    }
}
