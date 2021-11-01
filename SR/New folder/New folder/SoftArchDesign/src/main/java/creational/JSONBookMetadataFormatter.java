package creational;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    JSONObject Jbooks;
    JSONArray bookList;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see
        // fit.

        bookList = new JSONArray();
        Jbooks = new JSONObject();
        Jbooks.put("Books", bookList);

        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see
        // fit.

        this.bookList.add(JSONBookMetadataFormatter.parser(b));
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        return Jbooks.toString();
    }

    private static JSONObject parser(Book book) {

        JSONObject jbook = new JSONObject();
        jbook.put("ISBN", book.getISBN());
        jbook.put("Title", book.getTitle());
        jbook.put("Publisher", book.getPublisher());
        JSONArray authors = new JSONArray();
        String[] temp = book.getAuthors();
        for (int j = 0; j < temp.length; j += 1) {
            authors.add(temp[j]);
        }
        jbook.put("Authors", authors);

        return jbook;
    }
}
