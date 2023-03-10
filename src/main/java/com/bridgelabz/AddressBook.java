package com.bridgelabz;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class AddressBook {

    Contacts contact = new Contacts();
    List<Contacts> contactsList = new ArrayList<>();
//    Map<String, List<Contacts>> contactsByCity = new HashMap<>();
//    Map<String, List<Contacts>>  contactByState = new HashMap<>();
    public void addContact() {
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
        Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contactsList.add(contact);
    }

    public void addContactLisst() {
        Contacts contact1 = new Contacts("Prasanth", "Palle", "Kurnool", "Kurnool", "Andhrapradesh", "518401", "5172341413", "palle@gmail.com");
        Contacts contact2 = new Contacts("Rhul", "Palle", "Kurnool", "Anantapur", "Maharashtra", "518401", "5172341413", "palle@gmail.com");
        Contacts contact3 = new Contacts("Ramesh", "Palle", "Kurnool", "Anantapur", "Maharashtra", "518401", "5172341413", "palle@gmail.com");
        Contacts contact4 = new Contacts("Kiran", "Palle", "Kurnool", "Kurnool", "Andhrapradesh", "518401", "5172341413", "palle@gmail.com");
        Contacts contact5 = new Contacts("Jagadessh", "Palle", "Kurnool", "Kurnool", "Maharashtra", "518401", "5172341413", "palle@gmail.com");
        Contacts contact6 = new Contacts("Achchanna", "Palle", "Kurnool", "Anantapur", "Andhrapradesh", "518401", "5172341413", "palle@gmail.com");
        Contacts contact7 = new Contacts("Ramulu", "Palle", "Kurnool", "Anantapur", "Maharashtra", "518401", "5172341413", "palle@gmail.com");
        Contacts contact8 = new Contacts("Mahesh", "Palle", "Kurnool", "Kurnool", "Andhrapradesh", "518401", "5172341413", "palle@gmail.com");
        contactsList.add(contact1);
        contactsList.add(contact2);
        contactsList.add(contact3);
        contactsList.add(contact4);
        contactsList.add(contact5);
        contactsList.add(contact6);
        contactsList.add(contact7);
        contactsList.add(contact8);
        System.out.println("Contact added Successfully");
    }

    public void showContacts() {
        System.out.println("--------------------------------");
        if (contactsList.isEmpty()) {
            System.out.println("No records found");
        } else {
            contactsList.forEach(c -> {
                System.out.println("[Contact First Name=" + c.getFirstName() +
                        ",Contact Last Name=" + c.getLastName() +
                        ",Contact Address =" + c.getAddress() +
                        ",Contact City=" + c.getCity() +
                        ",Contact State=" + c.getState() +
                        ",Contact Zip=" + c.getZip() +
                        ",Contact Phone Number=" + c.getPhoneNumber() +
                        ",Contact Email=" + c.getEmail() +
                        "]");
            });
        }
        System.out.println("--------------------------------");
    }

    public void setCityContacts1(){
        contactsByCity = contactsList.stream().collect(Collectors.groupingBy(Contacts::getCity));
        System.out.println(contactsByCity);
    }

    public void setStateContacts1(){
        contactByState = contactsList.stream().collect(Collectors.groupingBy(Contacts::getState));
        System.out.println(contactByState);
    }




    public void writeData(Map<String, AddressBook> addressBook) {
        File file = new File("Contacts.txt");
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, AddressBook> entry : addressBook.entrySet()) {
                String key = entry.getKey();
                AddressBook value = entry.getValue();
                bf.write(entry.getKey() + ":" + value.getContactsList());
                bf.newLine();
            }
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }
}
