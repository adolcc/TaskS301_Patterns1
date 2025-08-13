package level3;

public class Main {

    public static void main(String[] args) {

        Vehicle coche = new Coche();
        Vehicle bici = new Bicicleta();
        Vehicle avion = new Avion();
        Vehicle barco = new Barco();

        Command arrancarCoche = new ArrancarCommand(coche);
        Command acelerarBici = new AcelerarCommand(bici);
        Command frenarAvion = new FrenarCommand(avion);
        Command arrancarBarco = new ArrancarCommand(barco);

        arrancarCoche.execute();
        acelerarBici.execute();
        frenarAvion.execute();
        arrancarBarco.execute();
    }
}
