public class Main {
    public static void main(String[] args) {

        // System.out.println("Test Running in main ");

        StringPublisher publisher = new StringPublisher(); 
        AlphabetSubscriber alpha = new AlphabetSubscriber();
        NumberSubscriber number  = new NumberSubscriber();
        SymbolSubscriber symbol = new SymbolSubscriber();

        publisher.addSubscriber(alpha);
        publisher.addSubscriber(number);
        publisher.addSubscriber(symbol);
        FileManager.ClearALlFile();

        publisher.publish("AlphabetOnly");
        publisher.publish("123Num");
        publisher.publish("/*__*/AlphaWithSymbol");

    }
}