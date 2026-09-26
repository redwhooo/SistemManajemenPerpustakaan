package manager;

import java.util.ArrayList;
import java.util.List;

import collection.LibraryCollection;
import user.User;

public class LibraryManager {

    private static LibraryManager instance;

    private List<LibraryCollection> collections;
    private List<User> users;

    private LibraryManager() {
        collections = new ArrayList<>();
        users = new ArrayList<>();
    }

    public static LibraryManager getInstance() {

        if (instance == null) {
            instance = new LibraryManager();
        }

        return instance;
    }

    public void addCollection(LibraryCollection collection) {
        collections.add(collection);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void showCollections() {

        System.out.println("=== DAFTAR KOLEKSI ===");

        for (LibraryCollection collection : collections) {
            System.out.println(collection.getInfo());
        }
    }

    public void showUsers() {

        System.out.println("=== DAFTAR PENGGUNA ===");

        for (User user : users) {
            System.out.println(user.getInfo());
        }
    }
}