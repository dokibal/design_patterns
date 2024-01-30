package builder.directors;

import builder.builders.Builder;
import builder.models.Engine;
import builder.models.GPS;
import builder.models.TripComputer;

public class Director{

    public void createDiesel(Builder builder){
        builder.setEngine(Engine.DIESEL);
        builder.setGPS(GPS.INBUILT);
        builder.setTripComputer(TripComputer.COMPUTER_1);
    }

    public void createElectric(Builder builder){
        builder.setEngine(Engine.ELECTRIC);
        builder.setGPS(GPS.EXTERNAL);
        builder.setSeats(5);
        builder.setTripComputer(TripComputer.COMPUTER_3);
    }

    public void createPetrol(Builder builder){
        builder.setEngine(Engine.PETROL);
        builder.setSeats(4);
        builder.setTripComputer(TripComputer.COMPUTER_2);
    }
};