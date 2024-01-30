package builder.builders;

import builder.models.CarManual;
import builder.models.Engine;
import builder.models.GPS;
import builder.models.TripComputer;

public class CarManualBuilder implements Builder {

    private CarManual carManual;
    
    public CarManualBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setSeats(int number) {
        carManual.seats = number;
    }

    @Override
    public void setEngine(Engine engine) {
        carManual.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        carManual.computer = computer;
    }

    @Override
    public void setGPS(GPS gps) {
        carManual.gps = gps;
    }

    public CarManual getResult(){
        return carManual;
    }
    
}
