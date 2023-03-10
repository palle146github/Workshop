package com.bridgelabz;

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

public class maptest {
    public static void main(String[] args) {
        Map<String, Integer> stateContacts = new HashMap<>();
        MultiMap multiMap = new MultiValueMap();
        multiMap.put("1", 1);
        multiMap.put("1", 2);
        multiMap.put("1", 3);
        multiMap.put("1", 4);
        multiMap.put("1", 5);
        System.out.println(multiMap);

        AddressBook addressBook = new AddressBook();
        for (Contacts c : addressBook.contactsList) {
            System.out.println(c.getFirstName());
        }

    }
}
