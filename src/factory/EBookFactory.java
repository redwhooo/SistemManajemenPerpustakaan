package factory;

import collection.LibraryCollection;
import collection.EBook;

public class EBookFactory extends CollectionFactory {

    @Override
    public LibraryCollection createCollection(
        String title,
        String author
    ) {
        return new EBook(title, author);
    }
}