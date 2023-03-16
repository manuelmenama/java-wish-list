package org.lessons.java.christmas;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {
    //attributi
    private String name;
    private String address;
    private List<String> wishList;

    //costruttori

    public ChristmasLetter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //getter e setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) throws IllegalArgumentException{
        if (wishList.size() > 5) {
            throw new IllegalArgumentException("Hai scritto troppi desideri!");
        }
        this.wishList = wishList;
    }


    //metodi
    public void send(){
        System.out.println(toString());
    }

    public String goodBadGenerator() {
        Random random = new Random();
        boolean isGood = random.nextBoolean();
        if (isGood) {
            return "Visto che sei stat* buon*, riceverai i tuoi regali.";
        } else {
            return "Ma sei stat* cattiv* e non riceverai nulla";
        }
    }

    @Override
    public String toString() {
        String message = "";
        Collections.sort(wishList);
        message = "Nome: " + getName() + "\n" + "Indirizzo: " + getAddress() + "\n" + "La tua lista:" + "\n";
        for (String element:
             getWishList()) {
            message += "- " + element + "\n";
        }
        message += goodBadGenerator();
        return message;
    }
}
