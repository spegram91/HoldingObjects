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
       book.addEntry("Jane Doe", "0987654321");
    }


    @Test
    public void testAddEntry(){
    //Given
        boolean expected = true;

    //When
        boolean actual = book.addEntry("Stephen Pegram", "3018432443");

    //Then
        assertEquals("Should return true", expected, actual);
    }

    @Test
    public void testRemoveEntry(){
    //Given
        boolean expected = true;

    //When
        boolean actual = book.removeEntry("John Doe");

    //Then
        assertEquals("Should return true", expected, actual);
    }

    @Test
    public void testLookUp(){
        //Given
        String expected = "(098)-765-4321";

        //When
        String actual = book.lookUp("Jane Doe");

        //Then
        assertEquals("Should return true", expected, actual);
    }

    @Test
    public void testListAllEntries(){
        //Given
        String expected = "Jane Doe (098)-765-4321\nJohn Doe (123)-456-7890\n";

        //When
        String actual = book.listAllEntries();

        //Then
        assertEquals("Should return true", expected, actual);
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
