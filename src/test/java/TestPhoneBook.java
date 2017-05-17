import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

/**
 * Created by stephenpegram on 5/16/17.
 */
public class TestPhoneBook {
    TreeMap<String, String> listing;
    PhoneBook book;

    @Before
    public void setUp(){
       listing  = new TreeMap<String, String>();
       book  = new PhoneBook();
       book.addEntry("John Doe", "1234567890");
       book.addEntry("John Doe", "6574839201");
       book.addEntry("Jane Doe", "0987654321");
       book.addEntry("Jane Doe", "0192837465");
    }


    @Test
    public void testAddEntry(){
    //Given
        boolean expected = true;

    //When
        boolean actual = book.addEntry("Stephen Pegram", "3018432443");

    //Then
        assertEquals("Should return true if entry has been added", expected, actual);
    }

    @Test
    public void testRemoveEntry(){
    //Given
        boolean expected = true;

    //When
        boolean actual = book.removeEntry("John Doe", "(123)-456-7890");

    //Then
        assertEquals("Should return true if single entry is removed", expected, actual);
    }

    @Test
    public void testRemoveRecord(){
        //Given
        boolean expected = true;

        //When
        boolean actual = book.removeRecord("John Doe");

        //Then
        assertEquals("Should return true if entire record is removed", expected, actual);
    }

    @Test
    public void testLookUp(){
        //Given
        String expected = "(098)-765-4321, (019)-283-7465";

        //When
        String actual = book.lookUp("Jane Doe");

        //Then
        assertEquals("Should return true if the name matches one in the listing", expected, actual);
    }

    @Test
    public void testListAllEntries(){
        //Given
        String expected = "Jane Doe, (098)-765-4321 | (019)-283-7465 | \n" + "John Doe, (123)-456-7890 | (657)-483-9201 | \n";

        //When
        String actual = book.listAllEntries();

        //Then
        assertEquals("Should return true if all entries are the same", expected, actual);
    }

    @Test
    public void testReverseLookUp(){
    //Given
        String expected = "Jane Doe";

    //When
        String actual = book.reverseLookUp("(098)-765-4321");

    //Then
        assertEquals(expected, actual);

    }
}
