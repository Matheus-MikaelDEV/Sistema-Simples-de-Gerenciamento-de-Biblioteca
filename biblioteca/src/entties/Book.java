package entties;

public class Book {
    private String title;
    private String author;
    private Integer code;

    public Book(String title, String author, Integer code) {
        this.title = title;
        this.author = author;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getCode() {
        return code;
    }
}
