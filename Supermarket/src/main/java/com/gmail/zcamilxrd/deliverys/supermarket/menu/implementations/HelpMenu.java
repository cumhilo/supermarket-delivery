package com.gmail.zcamilxrd.deliverys.supermarket.menu.implementations;

import com.gmail.zcamilxrd.deliverys.supermarket.menu.IMenu;

import java.util.Arrays;
import java.util.Scanner;

public class HelpMenu implements IMenu {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        IMenu selectMenu = new SelectMenu();

        Arrays.asList(
                "",
                "-x-*      Help Menu      *-x-",
                "here you can obtain essential information",
                "about the program and its functions.",
                "",
                "* In the menu selector you will see 2 options, one of them is",
                "the help menu, in the other one you can create your own invoice.",
                "-x-*                     *-x-",
                ""
        ).forEach(System.out::println);

        Arrays.asList("", "Do you want to return to the main menu?", "").forEach(System.out::println);

        boolean closeMenu = scanner.nextBoolean();
        if (closeMenu) {
            selectMenu.displayMenu();
        }
    }

    public void displayMenu() {
        start();
    }
}
