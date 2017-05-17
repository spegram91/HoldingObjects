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
        book.addEntry("Justin Haas", "7890123456");
        book.addEntry("Rahmir Ford","9012345678");

        System.out.println(book.listAllEntries());
        System.out.println(book.listAllNames());
        book.removeEntry("Anthony Jones");
        System.out.println(book.listAllEntries());
        System.out.println(book.listAllNames());
        book.lookUp("Aurora Banuelos");

    }
}
