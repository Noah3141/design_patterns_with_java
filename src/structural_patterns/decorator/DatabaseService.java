package structural_patterns.decorator;

public class DatabaseService {
    
    public String getPhoneNumFromId(int id) {
        // (SQL query SELECT * WHERE ID = id RETURNING phone_number).fetch_one
        return "360-828-8900";
    }

    public String getMailFromId(int id) {
        // (SQL query SELECT * WHERE ID = id RETURNING email).fetch_one
        return "virginia_whilikers@yahoo.net";
    }
}
