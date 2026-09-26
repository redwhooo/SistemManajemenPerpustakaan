import collection.LibraryCollection;
import factory.CollectionFactory;
import factory.EBookFactory;
import factory.PhysicalBookFactory;

import manager.LibraryManager;

import user.User;
import userfactory.StudentFactory;
import userfactory.UserFactory;

public class Main {

    public static void main(String[] args) {

        //Mendapatkan LibraryManager
        LibraryManager manager = LibraryManager.getInstance();

        //Membuat PhysicalBook melalui Factory
        CollectionFactory physicalBookFactory =
                new PhysicalBookFactory();

        LibraryCollection book =
                physicalBookFactory.createCollection(
                        "Laskar Pelangi",
                        "Andrea Hirata"
                );

        //Membuat EBook melalui Factory
        CollectionFactory ebookFactory =
                new EBookFactory();

        LibraryCollection ebook =
                ebookFactory.createCollection(
                        "Bumi",
                        "Tere Liye"
                );

        //Menambahkan koleksi ke LibraryManager
        manager.addCollection(book);
        manager.addCollection(ebook);

        //Membuat mahasiswa melalui Factory
        UserFactory studentFactory =
                new StudentFactory();

        User student =
                studentFactory.createUser(
                        "Budi",
                        "232410101001"
                );

        //Menambahkan user
        manager.addUser(student);

        //Menampilkan data
        manager.showCollections();

        System.out.println();

        manager.showUsers();

        //Menguji Singleton
        LibraryManager manager2 =
                LibraryManager.getInstance();

        System.out.println();
        System.out.println("Apakah manager dan manager2 adalah objek yang sama?");

        System.out.println(manager == manager2);
    }
}