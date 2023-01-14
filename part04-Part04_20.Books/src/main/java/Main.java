import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if(name.equals("")) break;
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, pages, year));
        }
        System.out.println();
        System.out.print("What information will be printed?");
        String input = scanner.nextLine();
        for(Book book:books){
            if(input.equals("everything")){
                System.out.println(book);
            }else if(input.equals("name")){
                System.out.println(book.name);
            }
        }
    }
}
