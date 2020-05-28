package com.company;

import java.util.ArrayList;

public class Usages {
    public static Address.Human findBySurname(String someSurname, Address.Human[] humans){
        for (Address.Human human : humans) {
            if (human.getSurname().equals(someSurname))
                return human;
        }
        return null;
    }

    public static String findByAddress(String address, Address.Human[] humans){
        for (Address.Human human : humans) {
            if (human.getAddress().equals(address))
                return human.getName() + " " + human.getSurname();
        }
        return "";
    }

    public static StringBuilder findSameStreet(Address.Human[] humans){
        ArrayList<String> usedAddresses = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (Address.Human value : humans) {
            if (!usedAddresses.contains(value.getAddress())) {
                StringBuilder samePeople = new StringBuilder();
                for (Address.Human human : humans) {
                    if (human.getAddress().equals(value.getAddress()))
                        samePeople.append(human.getName()).append(" ");
                }
                result.append(samePeople).append("\n");
                usedAddresses.add(value.getAddress());
            }
        }
        return result;
    }

}
