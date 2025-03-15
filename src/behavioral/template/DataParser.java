package behavioral.template;

public abstract class DataParser {
    protected void openFile(){
        System.out.println("open file");
    }

    protected void closeFile(){
        System.out.println("close file");
    }

    protected abstract void parseFile();

    public void parse(){
        openFile();
        parseFile();
        closeFile();
    }
}
