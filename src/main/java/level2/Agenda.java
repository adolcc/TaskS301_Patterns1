package level2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Address> addresses = new ArrayList<>();
    private final List<Phone> phones = new ArrayList<>();

    public void addContact(AddressFactory factory, String street, String city, String number) {
        addresses.add(factory.createAddress(street, city));
        phones.add(factory.createPhone(number));
    }

    public void listContacts() {
        addresses.forEach(address -> {
            int index = addresses.indexOf(address);
            System.out.println(address.getFullAddress() + " - " + phones.get(index).getFullNumber());
        });
    }
}

