import java.util.HashMap;
import java.util.Set;
public class Maps {
    public static void main(String[] args){
        // Create the HashMap:
        HashMap<String, String> countryCapitals = new HashMap<String, String>();

        // Add five countries and capitals to the 'countryCapitals' map:
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Oman", "Muscat");
        countryCapitals.put("Brazil", "Brasília");

        // Print all keys from the map
         System.out.println("Countries:");
        Set<String> countries = countryCapitals.keySet();
        for (String country : countries) {
            System.out.println(country);
        }
        // Print two countries and their capitals ('The capital of Oman is Muscat.')
        System.out.println("\nCapital cities:");
        System.out.println("The capital of Oman is " + countryCapitals.get("Oman") + ".");
        System.out.println("The capital of Japan is " + countryCapitals.get("Japan") + ".");

    }
}

