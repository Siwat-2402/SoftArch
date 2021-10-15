package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    JSONObject BookObject;
    JSONArray BookArray;

    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.

        BookObject = new JSONObject();
        BookArray = new JSONArray();
        BookObject.put("Books", BookArray);

        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.

        JSONObject newBookObject = new JSONObject();
        JSONArray newAuthorArray = new JSONArray();

        for (String author : b.getAuthors()){
            newAuthorArray.add(author);
        }

        newBookObject.put(Book.Metadata.ISBN.value,b.getISBN());
        newBookObject.put(Book.Metadata.AUTHORS.value, newAuthorArray);
        newBookObject.put(Book.Metadata.TITLE.value,b.getTitle());
        newBookObject.put(Book.Metadata.PUBLISHER.value,b.getPublisher());

        BookArray.add(newBookObject);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return BookObject.toString();
    }
}
