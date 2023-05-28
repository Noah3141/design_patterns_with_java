package structural_patterns.adapter;

//? App that does things with XML
public class ReceivingApp implements IReceivingApp {
    @Override
    public void displayData(XmlData xmlData) {
        // Displays data using XML
    }

    @Override
    public void displayStats(XmlData xmlData) {
        // Displays stats using XML
    }
}
