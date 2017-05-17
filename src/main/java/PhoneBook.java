import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


/**
 * Created by stephenpegram on 5/16/17.
 */
public class PhoneBook {

    TreeMap<String, ArrayList<String>> listing = new TreeMap<String, ArrayList<String>>();
    PhoneNumberFactory generator = new PhoneNumberFactory();


    public boolean addEntry(String name, String number) {
        boolean check = false;
        ArrayList<String> personsNumbers = new ArrayList<String>();
        if (listing.get(name) != null){
            personsNumbers = listing.get(name);
        }
        personsNumbers.add(generator.createNumberSafely(number));
        listing.put(name, personsNumbers);
        if(listing.get(name) != null) {check = true;}
        return check;
    }


    public boolean removeEntry(String name, String number) {
        boolean check = false;
        for (Map.Entry<String, ArrayList<String>> entry : listing.entrySet()) {
            if (name.equals(entry.getKey())) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    if (number.equals(entry.getValue().get(i))) {
                        entry.getValue().remove(i);
                        check = true;
                        break;
                    }
                    else{
                        throw new RecordNotPresentException();
                    }
                }
            }
        }
        return check;
    }

    public boolean removeRecord(String name) {
        ArrayList<String> removedElement;
        removedElement = listing.remove(name);
        if(removedElement != null) {return true;}
        else {return false;}
    }

    public String lookUp(String name){
        String list = "";
        try{
        for(Map.Entry<String, ArrayList<String>> entry : listing.entrySet()){
            if (name.equals(entry.getKey())){
                list = entry.getValue().toString();
            }
        }
            return list.substring(1, list.length()-1);
        } catch(RecordNotPresentException e){
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
            for(Map.Entry<String, ArrayList<String>> entry : listing.entrySet()) {
                sb.append(entry.getKey() + ", ");
                for (int i = 0; i < entry.getValue().size(); i++){
                    sb.append(entry.getValue().get(i) + " | ");
                }
                sb.append("\n");
        }
        return sb.toString();
    }

    public String reverseLookUp(String number) {
        String result = "Number not found.";
        for (Map.Entry<String, ArrayList<String>> entry : listing.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++)
                if (number.equals(entry.getValue().get(i))) {
                    result = entry.getKey();
                }
        }
        return result;
    }
}