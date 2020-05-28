package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {


        Address address1 = new Address("Sumy");
        Address address2 = new Address("Kyiv");
        Address address3 = new Address("Lviv");


        Address.Human[] humans = new Address.Human[5];
        humans[0] = address1.new Human("Max", "Basov", "01.05.2000");
        humans[1] = address2.new Human("Oleh", "Tsubin", "22.07.2000");
        humans[2] = address2.new Human("Dasha", "Kozlova", "10.04.2000");
        humans[3] = address3.new Human("Egor", "Shum", "20.05.2000");
        humans[4] = address3.new Human("Aliona", "Tenytska", "30.12.1999");



        
        String someSurname = "Shum";
        String result1 = Objects.requireNonNull(Usages.findBySurname(someSurname, humans)).getAddress();
        System.out.println("------1------\n" + someSurname + " lives at:\n" + result1);

        String someAddress = "Kyiv";
        String result2 = Usages.findByAddress(someAddress, humans);
        System.out.println("------2------\nAt " + someAddress + " live:\n" + result2);

        String result3 = Usages.findSameStreet(humans).toString();
        System.out.println("------3------\nAt same street live:\n" + result3);





        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            writer.write("------1------\n" + someSurname + " lives at:\n" + result1);
            writer.write("------2------\nAt " + someAddress + " live:\n" + result2);
            writer.write("------3------\nAt same street live:\n" + result3);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
