//package constructorsexample;


class book{
    int bookid;
    String bookname;

    book(int id,String name){
        bookid=id;
        bookname=name;
    }

    //copy constructor
    book(book a){
        bookid=a.bookid;
        bookname=a.bookname;
    }

    void display(){
        System.out.println(bookid+" "+bookname);
    }
}
public class copyconstructorexample {
    public static void main(String[] args) {
        book b1=new book(1,"java book");
        book b2=new book(b1);

        b1.display();
        b2.display();
    }
}
