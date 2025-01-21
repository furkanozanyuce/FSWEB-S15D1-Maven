package org.example.mobile;

public class Contact {
    private String name;
    private String phoneNumber;

    //constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //method
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        // İsim ve telefon numarasını case-insensitive veya tamamen birebir karşılaştırabilirsiniz
        if (!name.equalsIgnoreCase(contact.name)) return false;
        return phoneNumber.equals(contact.phoneNumber);
    }
}
