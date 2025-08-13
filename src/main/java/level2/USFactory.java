package level2;

public class USFactory implements AddressFactory {
    public Address createAddress(String street, String city) {
        return new USAddress(street, city);
    }

    public Phone createPhone(String number) {
        return new USPhone(number);
    }
}

class USAddress implements Address {
    private final String street, city;

    public USAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city + ", USA";
    }
}

class USPhone implements Phone {
    private final String number;

    public USPhone(String number) {
        this.number = number;
    }

    public String getFullNumber() {
        return "+1 " + number;
    }
}