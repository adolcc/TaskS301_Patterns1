package level2;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        AddressFactory spainFactory = new SpainFactory();
        AddressFactory usFactory = new USFactory();

        agenda.addContact(spainFactory, "Calle Gaudi", "Barcelona", "651000000");
        agenda.addContact(usFactory, "Main St", "New York", "1112223333");
        agenda.listContacts();

    }

}
