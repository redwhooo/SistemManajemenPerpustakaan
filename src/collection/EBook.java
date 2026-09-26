package collection;

public class EBook implements LibraryCollection {

    private String title;
    private String author;

    public EBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "E-Book: " + title + " - " + author;
    }
}