package level2;

// AddressFactory.java
public interface AddressFactory {
    Address createAddress(String street, String city);
    Phone createPhone(String number);
}
