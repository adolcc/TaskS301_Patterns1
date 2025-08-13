package level3;


public class FrenarCommand implements Command {
    private final Vehicle vehicle;

    public FrenarCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.frenar();
    }
}
