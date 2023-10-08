package main.java.com.demo.dp.behavioral.iterator.example;

public class Item {
    private String title;
    private String url;

    public Item(String title, String url) {
        super();
        this.title = title;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Item [title=" + title + ", url=" + url + "]";
    }
}
