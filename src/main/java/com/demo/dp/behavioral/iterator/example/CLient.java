package main.java.com.demo.dp.behavioral.iterator.example;

public class CLient {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addItem(new Item("first", "/1"));
        menu.addItem(new Item("second", "/2"));
        menu.addItem(new Item("third", "/3"));

        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item);
        }
    }
}
