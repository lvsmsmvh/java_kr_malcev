package com.company;

public class Address {

    private String addressName;

    public Address(String name) {
        this.addressName = name;
    }



    public class Human{
        private String name;
        private String surname;
        private String dateOfBorn; // "10.10.2000"

        public Human(String name, String surname, String dateOfBorn) {
            this.name = name;
            this.surname = surname;
            this.dateOfBorn = dateOfBorn;
        }

        public String getName() {
            return name;
        }


        public String getSurname() {
            return surname;
        }

        public String getAddress(){
            return addressName;
        }
    }

}
