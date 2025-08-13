package level2;

public class SpainFactory implements AddressFactory {
    public Address createAddress(String street, String city) {
        return new SpainAddress(street, city);
    }

    public Phone createPhone(String number) {
        return new SpainPhone(number);
    }
}

class SpainAddress implements Address {
    private final String street, city;

    public SpainAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {

        return street + ", " + city + ", España";
    }
}

class SpainPhone implements Phone {
    private final String number;

    public SpainPhone(String number) {
        this.number = number;
    }

    public String getFullNumber() {
        return "+34 " + number;
    }
}
