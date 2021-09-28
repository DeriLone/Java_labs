import java.util.Stack;

public class StackOfBook {
    Stack<Book> stack = new Stack<Book>();

    public void addBook(Book b){
        stack.push(b);
    }

    public String ShowNameOfBook(){
        Book UpperBook = stack.peek();
        return UpperBook.getName();
    }

    public Book removeBook(){
        Book UpperBook = stack.pop();
        return UpperBook;
    }

    public int showNumberOfBooks(){
        return stack.size();
    }

    public boolean isThereAbook(Book b){
        return stack.contains(b);
    }

}
