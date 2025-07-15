import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        // Create a trackList of type HashMap:
        HashMap<String, String> trackList = new HashMap<String, String>();

        // Add in at least 4 songs that are stored by title:
        trackList.put("Starlight", "Hold you in my arms, I just wanted to hold you in my arms");
        trackList.put("Hysteria", "It's bugging me, grating me, and twisting me around");
        trackList.put("Time Is Running Out", "You will suck the life out of me");
        trackList.put("Supermassive Black Hole", "You set my soul alight");

        //Pull out one of the songs by its track title:
        String selectedTitle = "Hysteria";
        String selectedLyrics = trackList.get(selectedTitle);
        System.out.println("selectedLyrics for '" + selectedTitle + "':");
        System.out.println(selectedLyrics);
        System.out.println();

        //Print out all the track names and lyrics in the format 'Track: Lyrics':
        System.out.println("Tracklist complete :");
        Set<String> titles = trackList.keySet();
        for (String title : titles) {
            System.out.println(title + " : " + trackList.get(title));
        }
    }
}

