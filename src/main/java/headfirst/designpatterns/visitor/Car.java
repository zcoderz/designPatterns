package headfirst.designpatterns.visitor;

public class Car implements Vehicle{
    private int manufactureDate;
    private int doors;

    public Car(String color, int doors) {
        this.doors = doors;
        this.manufactureDate = manufactureDate;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}
