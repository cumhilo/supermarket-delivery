package com.gmail.zcamilxrd.deliverys.supermarket.menu.implementations;

import com.gmail.zcamilxrd.deliverys.supermarket.menu.IMenu;
import com.gmail.zcamilxrd.deliverys.supermarket.utils.ConsoleUtil;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMenu implements IMenu {
    public void start() {
        IMenu helpMenu = new HelpMenu();
        IMenu invoiceMenu = new InvoiceMenu();

        Arrays.asList(
                "",
                "-x-*      Menu      *-x-",
                "",
                "* Please choose one of the following ",
                "options and write it in the input field",
                "",
                "1. Open the menu to create an invoice",
                "2. Open the help menu",
                "3. Exit menu",
                ""
        ).forEach(System.out::println);

        byte option = Byte.parseByte(ConsoleUtil.scanner.nextLine());

        switch (option) {
            case 1:
                invoiceMenu.displayMenu();
                break;
            case 2:
                helpMenu.displayMenu();
                break;
            case 3:
                System.out.println("You have gone off the menu correctly! 👋");
                break;
            default:
                System.out.println("⚠ Choose a valid option ⚠");
                this.start();
                break;
        }
    }

    public void displayMenu() {
        start();
    }
}
