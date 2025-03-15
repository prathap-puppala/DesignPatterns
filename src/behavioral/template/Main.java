package behavioral.template;

// We can use this Pattern when we have almost same steps for every algorithm except few changes in few steps
public class Main {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();

        JsonParser jsonParser = new JsonParser();
        jsonParser.parse();
    }
}
