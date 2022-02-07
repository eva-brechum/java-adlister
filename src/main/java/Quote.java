import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String author_firstName;
    private String author_lastName;
    private String content;

    public Quote() {};

    public Quote(long id, String author_firstName, String author_lastName, String content) {
        this.id = id;
        this.author_firstName = author_firstName;
        this.author_lastName = author_lastName;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor_firstName() {
        return author_firstName;
    }

    public void setAuthor_firstName(String author_firstName) {
        this.author_firstName = author_firstName;
    }

    public String getAuthor_lastName() {
        return author_lastName;
    }

    public void setAuthor_lastName(String author_lastName) {
        this.author_lastName = author_lastName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
