package factory;

import collection.LibraryCollection;
import collection.PhysicalBook;

public class PhysicalBookFactory extends CollectionFactory {

    @Override
    public LibraryCollection createCollection(
        String title,
        String author
    ) {
        return new PhysicalBook(title, author);
    }
}