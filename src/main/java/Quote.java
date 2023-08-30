import java.util.ArrayList;

public class Quote {
    private long id;
    private String content;
    private Author author;

    public Quote(String content, Author author) {
        this.content = content;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    private ArrayList<String> quotes;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Quote() {
    }
    public Quote(String content, Author author, ArrayList<String> quotes) {
        this.content = content;
        this.author = author;
        this.quotes = quotes;
    }

    public Quote(String content) {
        this.content = content;
    }


    public ArrayList<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<String> quotes) {
        this.quotes = quotes;
    }

}
