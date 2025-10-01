package Behavioural.Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber user1 = new EmailSubscriber("User1");
        Subscriber user2 = new SMSSubscriber("User2");

        agency.addSubscriber(user1);
        agency.addSubscriber(user2);

        agency.setNews("New Java version released!");
        agency.setNews("Observer Pattern tutorial available!");
    }
}
