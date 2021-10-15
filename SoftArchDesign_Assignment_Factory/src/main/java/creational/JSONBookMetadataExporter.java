package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    public BookMetadataFormatter createBookExporter(){
        return new JSONBookMetadataFormatter();
    }
}