package Behavioural.Observer;

public class SMSSubscriber implements Subscriber {
    private String name;

    public SMSSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news via SMS: " + news);
    }
}
