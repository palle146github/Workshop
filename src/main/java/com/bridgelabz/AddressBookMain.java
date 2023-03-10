package com.bridgelabz;
import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Map<String, AddressBook> addressBookMap = new HashMap<>();
        System.out.println("Choose one option");
        System.out.println(" 1. Add address Book");
        System.out.println(" 2. Add Contact to address book");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Add new AddressBook");
                Scanner s = new Scanner(System.in);
                System.out.println("Enter name of Address Book");
                String adressBookName = s.nextLine();
                String adressBookName = s.nextLine();
                addressBookMap.put(addressBookName, addressBook);
                break;
            case 2:
                System.out.println("Enter address Book name to add contact");
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();
                AddressBook ab = addressBookMap.get(name);
                ab.addContact();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }


}
