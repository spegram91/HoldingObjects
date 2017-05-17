/**
 * Created by stephenpegram on 5/16/17.
 */
public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.addEntry("Stephen Pegram", "2404616071");
        book.addEntry("Aurora Banuelos", "1234567890");
        book.addEntry("Chris Kim", "3456789012");
        book.addEntry("Anthony Jones", "5678901234");
        book.addEntry("Anthony Jones", "7395628174");
        book.addEntry("Justin Haas", "7890123456");
        book.addEntry("Rahmir Ford","9012345678");
        book.addEntry("Rahmir Ford", "4729475801");

        System.out.println(book.listAllEntries());
        System.out.println(book.listAllNames());
        book.removeRecord("Anthony Jones");
        book.removeEntry("Rahmir Ford", "(901)-234-5678");
        System.out.println(book.listAllEntries());
        System.out.println(book.listAllNames());
        System.out.println(book.lookUp("Aurora Banuelos"));
        System.out.println(book.reverseLookUp("(901)-234-5678"));


    }
}
