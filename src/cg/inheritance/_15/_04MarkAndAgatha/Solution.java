package cg.inheritance._15._04MarkAndAgatha;


//region original
/*
import java.util.LinkedList;
import java.util.List;



public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //write your code here

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}

 */
//endregion




import java.util.LinkedList;
import java.util.List;



public class Solution {

    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();

        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));

        System.out.println(books);
    }

    public static class MarkTwainBook extends Book{
    private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book{
    private String title;

    public AgathaChristieBook(String title) {
        super("Agatha Christie");
        this.title = title;
    }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
        return this.title;
        }
    }

    // ABSTRACT BOOK
    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = author.equals("Agatha Christie") ? agathaChristieOutput : markTwainOutput;

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }






}
