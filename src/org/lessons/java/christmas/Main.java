package org.lessons.java.christmas;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> wishList = new ArrayList<>();

        System.out.println("Benevenuto nella casella postale di Babbo Natale!");

        boolean finished = false;

        ChristmasLetter letter = new ChristmasLetter("Manuel", "Via dei Matti, n. 0");

        while (!finished) {
            System.out.print("Inserisci un articolo: ");
            String wish = scanner.nextLine();
            wishList.add(wish);
            try {
                letter.setWishList(wishList);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
            /*wishList.add(scanner.nextLine());*/
            System.out.println("Hai inserito un totale di " + wishList.size() + " articoli");
            System.out.print("Vuoi inserire altro? (s/n): ");
            finished = scanner.nextLine().equalsIgnoreCase("n");
        }

        letter.send();

        /*String[] array = new String[wishList.size()];

        wishList.toArray(array);

        System.out.println("La tua lista: " + Arrays.toString(array));*/

        scanner.close();
    }
}
