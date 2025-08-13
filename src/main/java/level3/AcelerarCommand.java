package level3;


public class AcelerarCommand implements Command {
    private final Vehicle vehicle;

    public AcelerarCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.acelerar();
    }
}
