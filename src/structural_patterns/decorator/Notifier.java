package structural_patterns.decorator;

public class Notifier implements INotifier {
    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String msg) {
        String mail = databaseService.getMailFromId(46);
        System.out.println("Sending" + msg + " by mail to " + mail );
    }
}
