package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    //constructor
    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    //getter
    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    //methods
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0) {
            return false;
        }
        this.myContacts.set(findContact(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) < 0) {
            return false;
        }
        this.myContacts.remove(findContact(contact));
        return true;
    }

    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {

        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index < 0) {
            return null;
        }
        return this.myContacts.get(index);
    }

    public void printContacts() {
        System.out.println("Contacts;");
        for (Contact contact : myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
