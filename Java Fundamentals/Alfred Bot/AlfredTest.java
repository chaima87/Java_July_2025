public class AlfredTest {
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Test the guestGreeting method
        String greetingTest = alfredBot.guestGreeting("Beth Kane", "evening");

        // Print the output to verify
        System.out.println(greetingTest);

        // ✅ New test
        String dateTest = alfredBot.dateAnnouncement();
        System.out.println(dateTest);

        // ✅ Tests for answeringBeforeAlexis
        String testAlexis = alfredBot.answeringBeforeAlexis(
            "Alexis! Play some low-fi beats."
        );
        System.out.println(testAlexis);

        String testAlfred = alfredBot.answeringBeforeAlexis(
            "I can't find my keys. Maybe Alfred will know where they are."
        );
        System.out.println(testAlfred);

        String testNeither = alfredBot.answeringBeforeAlexis(
            "Maybe I should just go for a walk."
        );
        System.out.println(testNeither);

        // Test for overloaded guestGreeting
        String shortGreeting = alfredBot.guestGreeting("Bruce Wayne");
        System.out.println(shortGreeting);

        // Test other Methods:
        String moodTest1 = alfredBot.moodResponse("I'm feeling awesome today!");
        System.out.println(moodTest1);

        String moodTest2 = alfredBot.moodResponse("I'm kind of tired and sad.");
        System.out.println(moodTest2);

        String moodTest3 = alfredBot.moodResponse("I'm so angry with traffic!");
        System.out.println(moodTest3);

        String moodTest4 = alfredBot.moodResponse("Nothing much, just chilling.");
        System.out.println(moodTest4);

    }
    
}
