package builder.builders;

import builder.models.Car;
import builder.models.Engine;
import builder.models.GPS;
import builder.models.TripComputer;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder(){
        this.reset();
    }
    
    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.seats = number;
    }

    @Override
    public void setEngine(Engine engine) {
        car.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        car.computer = computer;
    }

    @Override
    public void setGPS(GPS gps) {
        car.gps = gps;
    }
    
    public Car getResult(){
        return car;
    }
}
