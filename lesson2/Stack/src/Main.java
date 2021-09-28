import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackOfBook stack = new StackOfBook();

        Book FavoriteBook = new Book("favoriteBook");

        stack.addBook(new Book("book1"));
        stack.addBook(new Book("book2"));
        stack.addBook(new Book("book3"));
        stack.addBook(FavoriteBook);
        stack.addBook(new Book("book5"));

        Person bookworm = new Person();

        bookworm.lookAtBook(stack);
        bookworm.takeABook(stack);
        bookworm.lookAtBook(stack);

        bookworm.countBooks(stack);

        bookworm.addBook(stack, new Book("book6"));
        bookworm.lookAtBook(stack);

        bookworm.findABook(stack, FavoriteBook);

        bookworm.takeABook(stack);
        bookworm.takeABook(stack);
        bookworm.lookAtBook(stack);

        bookworm.findABook(stack, FavoriteBook);
    }
}
