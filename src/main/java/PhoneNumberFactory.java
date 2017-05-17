/**
 * Created by stephenpegram on 5/16/17.
 */
public class PhoneNumberFactory {


    public static String createNumberSafely(String number) {
        String formattedNumber = String.format("(%s)-%s-%s", number.substring(0, 3), number.substring(3,6), number.substring(6,10));
        try{
            return createPhoneNumber(formattedNumber);
        }
        catch(InvalidPhoneNumberFormatException e){
            System.out.println("Not a valid phone number.");
            return null;
        }
    }

    public static String createPhoneNumber(String number) throws InvalidPhoneNumberFormatException {
        PhoneNumber phoneNumber = new PhoneNumber(number);
        return phoneNumber.getNumberString();
    }
}


