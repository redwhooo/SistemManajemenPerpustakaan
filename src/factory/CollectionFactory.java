package factory;

import collection.LibraryCollection;

public abstract class CollectionFactory {

    public abstract LibraryCollection createCollection(
        String title,
        String author
    );
}