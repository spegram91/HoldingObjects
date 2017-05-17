/**
 * Created by stephenpegram on 5/16/17.
 */
public final class PhoneNumber {

    String message = "This is not a valid phone number";
    private final String numberString;

    private PhoneNumber() throws InvalidPhoneNumberFormatException{
        this(null);
    }

    PhoneNumber (String phoneNumber) throws InvalidPhoneNumberFormatException{
        if (!phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {
            throw new InvalidPhoneNumberFormatException();
        }
        this.numberString = phoneNumber;
    }

    public String getNumberString() {
        return numberString;
    }



}



