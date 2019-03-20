public class TestBookList {
    public static void main(String[] args) {
        

        BookList books = new BookList();

        books.setBookMap(1, "Tony");
        books.setBookMap(2, "Khalid");
        books.setBookMap(3, "James");

        books.getBookMap();

    }
}