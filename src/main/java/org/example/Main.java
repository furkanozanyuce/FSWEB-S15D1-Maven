package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

public class Main {
    public static void main(String[] args) {
        //Grocery.startGrocery();

        lines();

        MobilePhone phone = new MobilePhone("5555555555");

        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        Contact jane = Contact.createContact("Jane", "23571113");

        phone.addNewContact(bob);
        phone.addNewContact(alice);
        phone.addNewContact(tom);
        phone.addNewContact(jane);

        phone.printContacts();
    }

    public static void lines() {
        System.out.println("------------------");
    }
}
