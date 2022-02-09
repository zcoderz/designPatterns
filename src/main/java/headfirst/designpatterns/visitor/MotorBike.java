package headfirst.designpatterns.visitor;

public class MotorBike implements Vehicle {

    private int engineCapacity;
    private int noSeats;

    public MotorBike(int engineCapacity, int noSeats) {
        this.engineCapacity = engineCapacity;
        this.noSeats = noSeats;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }

}
