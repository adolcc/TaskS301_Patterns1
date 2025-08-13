package level3;


public class ArrancarCommand implements Command {
    private final Vehicle vehicle;

    public ArrancarCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.arrancar();
    }
}