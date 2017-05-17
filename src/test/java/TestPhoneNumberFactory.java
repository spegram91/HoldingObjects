import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stephenpegram on 5/16/17.
 */

public class TestPhoneNumberFactory {

    @Test
    public void testCreateNumberSafely() {
        // : Given
        String number = "3018432443";
        String expected = "(301)-843-2443";

        // : When
        String actual = PhoneNumberFactory.createNumberSafely(number);

        // : Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testCreatePhoneNumber(){
//    //Given
//        String expected = "(098)-765-4321";
//
//    //When
//        try {
//            String actual = PhoneNumberFactory.createPhoneNumber(expected);
//        }catch(InvalidPhoneNumberFormatException e){
//            System.out.println("Not a valid number.");
//        }
//
//    //Then
//        Assert.assertEquals(expected, actual);
//
//    }

}
