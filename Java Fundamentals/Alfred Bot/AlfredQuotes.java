import java.util.Date;

public class AlfredQuotes {

    // Implemented guestGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + ", " + name + ". Lovely to see you.";
    }
    // ✅ New dateAnnouncement method
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate;
    }

    // ✅ answeringBeforeAlexis method
    public String answeringBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

        // Overloaded version: only takes the name
        public String guestGreeting(String name) {
            return "Hello, " + name + ". It's a pleasure to see you.";
        }

        // Impliment other methods:
        public String moodResponse(String userInput) {
    String input = userInput.toLowerCase();

    if (input.contains("happy") || input.contains("great") || input.contains("awesome")) {
        return "I'm delighted to hear that! Shall I play your favorite music?";
    } else if (input.contains("sad") || input.contains("tired") || input.contains("upset")) {
        return "I'm here for you. Would you like me to tell a joke or play something calming?";
    } else if (input.contains("angry") || input.contains("mad") || input.contains("furious")) {
        return "Deep breaths. I suggest a short break or a walk, sir.";
    } else {
        return "I'm not quite sure how you're feeling, but I'm always here to assist.";
    }
}

}

