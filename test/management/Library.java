package management;

import java.util.ArrayList;
import library.LibraryItem;

public class Library {

    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void borrowAll() {
        for (LibraryItem item : items) {
            item.borrowItem();
        }
    }

    public void returnAll() {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
}