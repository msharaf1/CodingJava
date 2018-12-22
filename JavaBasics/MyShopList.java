import java.util.ArrayList;

public class MyShopList{

    public String hW = "This is test from Shop list.";

    ArrayList<Object> bookList = new ArrayList<Object>();
    

    MyShopList(){};//Constructor

    // public void setList(ArrayList<Object> bookList){
        bookList.add("Computer Science.");
        bookList.add("Java Fundaments.");
    // }
    public ArrayList<Object> getBookList(){
        return this.bookList;
    }

}//class