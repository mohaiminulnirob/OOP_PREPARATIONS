package lab13;

public class Book {
    String title;
    String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    Book(String title, String ISBN){
        this.title=title;
        this.ISBN=ISBN;
    }
}
