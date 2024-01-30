package builder.builders;

import builder.models.Engine;
import builder.models.GPS;
import builder.models.TripComputer;

public interface Builder {
    public void reset();
    public void setSeats(int number);
    public void setEngine(Engine engine);
    public void setTripComputer(TripComputer computer);
    public void setGPS(GPS gps);
}
