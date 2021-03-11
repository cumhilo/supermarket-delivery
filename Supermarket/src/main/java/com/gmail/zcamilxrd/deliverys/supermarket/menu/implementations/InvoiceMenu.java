package com.gmail.zcamilxrd.deliverys.supermarket.menu.implementations;

import com.gmail.zcamilxrd.deliverys.supermarket.entity.SupermarketEntity;
import com.gmail.zcamilxrd.deliverys.supermarket.menu.IMenu;
import com.gmail.zcamilxrd.deliverys.supermarket.utils.IMultiply;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InvoiceMenu implements IMenu {
    public List<Integer> prices = new ArrayList<>();
    public List<SupermarketEntity> supermarketEntities = new ArrayList<>();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        IMenu selectMenu = new SelectMenu();
        IMultiply multiply = (number1, number2) -> (number1 * number2);

        System.out.println("Please provide the seller name:");
        String seller = scanner.nextLine();
        System.out.println("Please provide the product name:");
        String product = scanner.nextLine();
        System.out.println("Please provide the product price:");
        int price = scanner.nextInt();
        System.out.println("Please provide the product quantity:");
        short quantity = scanner.nextShort();

        SupermarketEntity supermarket = new SupermarketEntity(seller, product, price, quantity);
        supermarketEntities.add(supermarket);

        Arrays.asList("",
                "You have added the following product: " + supermarket.getProduct(),
                "Quantity: " + supermarket.getQuantity(),
                "Price: " + supermarket.getPrice(),
                "Overall value: " + multiply.addMultiply(price, quantity),
                "",
                "Additional information:",
                "Seller: " + supermarket.getSeller(),
                "Product ID" + supermarket.getId(),
                "").forEach(System.out::println);


        prices.add(multiply.addMultiply(price, quantity));

        int setPrice = prices.stream().mapToInt(integer -> integer).sum();

        Arrays.asList("", "Do you want to return to the main menu?", "").forEach(System.out::println);

        boolean closeMenu = scanner.nextBoolean();
        if (closeMenu) {
            selectMenu.displayMenu();
        }

        Arrays.asList("", "Do you want to receive an invoice?", "").forEach(System.out::println);

        boolean receiveInvoice = scanner.nextBoolean();
        if (receiveInvoice) {
            for (SupermarketEntity supermarketPrintln : supermarketEntities) {
                Arrays.asList(
                        "",
                        "-*                Product                -*",
                        "Seller: " + supermarketPrintln.getSeller(),
                        "Product: " + supermarketPrintln.getProduct(),
                        "Price: " + supermarketPrintln.getPrice(),
                        "Quantity: " + supermarketPrintln.getQuantity(),
                        "Id: " + supermarketPrintln.getId(),
                        "Time: " + supermarketPrintln.getTime(),
                        "-*                                       -*",
                        "").forEach(System.out::println);
            }
            System.out.println("Total value: " + setPrice);
            return;
        }
        this.displayMenu();
    }

    public void displayMenu() {
        start();
    }
}
