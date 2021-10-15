package creational;

import java.io.IOException;
import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;

public abstract class BookMetadataExporter extends BookCollection {

    public abstract BookMetadataFormatter createBookExporter() throws IOException,ParserConfigurationException;
    
    public void export(PrintStream stream) throws IOException,ParserConfigurationException {
        BookMetadataFormatter formatter = createBookExporter();
        for (Book BookObject : books){
            formatter.append(BookObject);
        }
        stream.println(formatter.getMetadataString());
    }
}
