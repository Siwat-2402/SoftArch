package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    public BookMetadataFormatter createBookExporter() throws IOException{
        return new CSVBookMetadataFormatter();
    }
    
}
