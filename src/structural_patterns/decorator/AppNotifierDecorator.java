package structural_patterns.decorator;

public class AppNotifierDecorator extends BaseNotifierDecorator { // As in, "notifications through the app", where the Notifier class does it thru email or something
    public AppNotifierDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String phoneNum = databaseService.getPhoneNumFromId(42);
        System.out.println("Sending message: \"" + msg + "\" thru App to" + phoneNum);
    }
}
