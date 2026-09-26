package collection;

public class PhysicalBook implements LibraryCollection {

    private String title;
    private String author;

    public PhysicalBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "Buku Fisik: " + title + " - " + author;
    }
}