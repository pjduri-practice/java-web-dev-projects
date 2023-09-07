package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item = new MenuItem(2.66, "Tasty Toasted Ravs", "Appetizers", true);
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(item);
        Date now = new Date();

        Menu menu = new Menu(now, items);
        System.out.println(menu.getLastUpdated());
    }
}
