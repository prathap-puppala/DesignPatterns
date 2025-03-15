package behavioral.template;

public class Main {
    public static void main(String[] args) {
        CSVParser parser = new CSVParser();
        parser.parse();

        JsonParser jsonParser = new JsonParser();
        parser.parse();
    }
}
