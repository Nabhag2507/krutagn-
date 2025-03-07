
class book {

    private String author;

    book(String author) {
        this.author = author;
    }

    public String get() {
        return author;
    }
    void print(String author) {
        System.out.println();
        // System.out.print("Book by " + author);
    }
}

class bookPublication extends book {

    private String title;

    bookPublication(String title, String author) {
        super(author);
        this.title = title;
    }

    public void print(String author) {
        System.out.println();
        System.out.print("Book publication is " + title + " by " + author);
    }
}

class paperPublication extends book {

    private String title;

    paperPublication(String title, String author) {
        super(author);
        this.title = title;
    }

    public void print(String author) {
        System.out.println();
        System.out.print("Book publication is " + title + " by " + get());
    }
}

public class Lab7a2 {

    public static void main(String[] args) {
        // bookPublication bp = new bookPublication("Introduction to Java", "John
        // Smith");
        // paperPublication p1 = new paperPublication("Cool paper publication", "John
        // Smith");
        // bp.print(bp.get());
        // System.out.println();
        // System.out.println();
        // p1.print(p1.get());

        book b;
        String str = args[0];
        String str1 = args[1];
        String str2 = args[2];
        if (str.equals("book")) {
            b = new bookPublication(str1, str2);
        } 
        else if (str.equals("paper")) {
            b = new paperPublication(str1, str2);
        } 
        else {
            System.out.println("Invalid input");
            return;
        }
        b.print(str);
        b.print(str1);
        b.print(str2);
    }
}
