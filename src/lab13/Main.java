package lab13;


public class Main {
    public static void main(String[] args) {
        LibraryInventory<Book> bookInventory=new LibraryInventory<>();
        LibraryInventory<Magazine>  magazineInventory= new LibraryInventory<>();
        Book b1=new Book("abc","A123");
        Book b2=new Book("def","A456");
        Magazine m1= new Magazine("pqr","A789");
        Magazine m2=new Magazine("xyz","A123");
        bookInventory.store.add(b1);
        bookInventory.store.add(b2);
        magazineInventory.store.add(m1);
        magazineInventory.store.add(m2);
        for(Book book : bookInventory.store){
            System.out.println(book.getTitle());
        }
        for(Magazine magazine : magazineInventory.store){
            System.out.println(magazine.getVersion());
        }
    }
}
//lambda expression(functional interface+anonymous class)
//

//we can bound generics by using interface
