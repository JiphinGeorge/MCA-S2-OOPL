package dvd;

import library.LibraryItem;

public class DVD implements LibraryItem {

    private String title;
    private String director;
    private int duration;

    public DVD(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public void borrowItem() {
        System.out.println("DVD borrowed: " + title);
    }

    public void returnItem() {
        System.out.println("DVD returned: " + title);
    }

    public void display() {
        System.out.println("Title: " + title +
                ", Director: " + director +
                ", Duration: " + duration + " mins");
    }
}