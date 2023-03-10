package com.bridgelabz;

import java.util.*;

public class AddressBook {

    Contacts contact = new Contacts();
    List<Contacts> contactsList = new ArrayList<>();
    Map<String, Contacts> cityContacts = new HashMap<>();
    Map<String, Contacts> stateContacts = new HashMap<>();

    public void addContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact First Name");
        String firstName = scanner.next();
        System.out.println("Enter Contact Last Name");
        String lastName = scanner.next();
        System.out.println("Enter Contact Address Details");
        String address = scanner.next();
        System.out.println("Enter Contact City Name");
        String city = scanner.next();
        System.out.println("Enter Contact State Name");
        String state = scanner.next();
        System.out.println("Enter Contact Zip");
        String zip = scanner.next();
        System.out.println("Enter Contact Phone Number");
        String phoneNumber = scanner.next();
        System.out.println("Enter Contact Email");
        String email = scanner.next();
        Contacts contact = Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contactsList.add(contact);
    }
}
