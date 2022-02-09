package headfirst.designpatterns.visitor;

public interface Vehicle {

    /* Every vehicle that has gone under a full service is supposed to let the Vehicle Inspector to calculate
    the total Service Charge. */
    int accept(VehicleInspector vehicleInspector);

}