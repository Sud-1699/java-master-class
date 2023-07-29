package genericClasses;

public class Letter {
    private final String sender;
    private final String receiver;

    public Letter(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "genericClasses.Letter{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
