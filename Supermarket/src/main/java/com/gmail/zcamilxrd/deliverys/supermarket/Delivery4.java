package com.gmail.zcamilxrd.deliverys.supermarket;

import com.gmail.zcamilxrd.deliverys.supermarket.menu.IMenu;
import com.gmail.zcamilxrd.deliverys.supermarket.menu.implementations.SelectMenu;

public class Delivery4 {
    public static void main(String[] args) {
        IMenu menu = new SelectMenu();
        menu.displayMenu();
    }
}
