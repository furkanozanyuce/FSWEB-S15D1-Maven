package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        startGrocery();
    }

    public static List<String> groceryList = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void startGrocery() {

        int choice;

        do {
            System.out.println("Ne yapmak istiyorsun?(0: Çıkış, 1: Ekle,2: Çıkar)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    break;
            }


        }
        while (choice != 0);
        scanner.close();
    }

    public static void addItems(String input) {
        String[] splitItems = input.split(",");
        for (String item : splitItems) {
            String trimmed = item.trim();
            if (checkItemIsInList(trimmed)) {
                System.out.println("Girilen item listede mevcut: " + item);
            } else {
                groceryList.add(trimmed);
                sortItems();
            }
        }

    }

    public static void removeItems(String input) {
        String[] splitItems = input.split(",");
        for (String item : splitItems) {
            String trimmed = item.trim();
            if (!checkItemIsInList(trimmed)) {
                System.out.println("Girilen item listede mevcut değil: " + item);
            } else {
                groceryList.remove(trimmed);

            }
        }
    }

    public static void sortItems() {
        Collections.sort(groceryList);
    }

    private static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);

    }

    public static void printSorted() {
        sortItems();
        System.out.println("Mevcut liste: ");

        for (String item : groceryList) {
            System.out.println(item);
        }

    }
}
