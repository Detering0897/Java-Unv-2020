package Ex3;

class Book {
    private String author= "";
    private String name = "";
    private int year = 1900;
    public void setAuthor(String au) {
        author = au;
    }
    public void setName(String nm) {
        name = nm;
    }

    public void setYear(int ye) {
        year = ye;
    }

    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Shrodinger");
        book.setName("Catahezis");
        book.setYear(1789);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYear());
    }
}
