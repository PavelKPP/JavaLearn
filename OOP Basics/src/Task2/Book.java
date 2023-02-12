package Task2;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        System.out.println("Put Title, Author, Content. Alternately.");
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        Scanner sc = new Scanner(System.in);

         title.setTitle(sc.nextLine());
         title.getTitle();

         author.setAuthor(sc.nextLine());
         author.getAuthor();

         content.setContent(sc.nextLine());
         content.getContent();

         title.show();
         author.show();
         content.show();


    }
}
