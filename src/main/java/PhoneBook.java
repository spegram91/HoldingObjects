import java.util.TreeMap;

/**
 * Created by stephenpegram on 5/16/17.
 */
public class PhoneBook {
    TreeMap<String, String> listing = new TreeMap<String, String>();
    PhoneNumberFactory generator = new PhoneNumberFactory();


    public boolean addEntry(String name, String number) {
        boolean check = false;
        listing.put(name, generator.createNumberSafely(number));
        if(listing.get(name) != null) {check = true;}
        return check;
    }


    public boolean removeEntry(String name) {
        String removedElement;
        removedElement = listing.remove(name);
        if(removedElement != null) {return true;}
        else {return false;}
    }

    public String lookUp(String name){
        try{
            return listing.get(name);
        } catch(NullPointerException e){
            System.out.println("There is no such name in this listing.");
            return null;
        }
    }

    public String listAllNames(){
        StringBuilder sb = new StringBuilder();
        for(String name : listing.keySet()){
            sb.append(name + "\n");
        }
        return sb.toString();
    }

    public String listAllEntries() {
        StringBuilder sb = new StringBuilder();
        for(String name : listing.keySet()){
            sb.append(name +", "+listing.get(name)+ "\n");
        }
        return sb.toString();
    }



}