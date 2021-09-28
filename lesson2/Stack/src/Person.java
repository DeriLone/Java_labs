public class Person {

    public void lookAtBook(StackOfBook stack){
        String NameOfUpperBook = stack.ShowNameOfBook();
        System.out.println(NameOfUpperBook);
    }

    public void takeABook(StackOfBook stack){
        Book book = stack.removeBook();
        System.out.println(book);
    }

    public void addBook(StackOfBook stack, Book book){
        stack.addBook(book);
    }

    public void countBooks(StackOfBook stack){
        int NumberOfBooks = stack.showNumberOfBooks();
        System.out.println(NumberOfBooks);
    }

    public void findABook(StackOfBook stack, Book book){
        boolean BookAvailability = stack.isThereAbook(book);
        System.out.println(BookAvailability);
    }
}
