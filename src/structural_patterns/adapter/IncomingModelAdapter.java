package structural_patterns.adapter;

public class IncomingModelAdapter implements IReceivingApp {
    private final IncomingModel incomingModel;

    public IncomingModelAdapter() {
        incomingModel = new IncomingModel();
    }


    private JsonData convertXmlToJson(XmlData xmlData) {
        // Conversion process returning json
        JsonData jsonData = new JsonData();
        return jsonData;
    }

    @Override
    public void displayData(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData); // Haha "OOP" strikes again
        incomingModel.displayData(jsonData);
    }

    @Override
    public void displayStats(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        incomingModel.displayStats(jsonData);
        
    }






}

