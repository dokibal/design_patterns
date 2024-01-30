package builder;

import builder.builders.CarBuilder;
import builder.builders.CarManualBuilder;
import builder.directors.Director;
import builder.directors.FixedDirector;

public class Demo {
    public static void main(String[] args){
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        Director director = new Director();
        director.createDiesel(carBuilder);
        System.out.println(carBuilder.getResult().engine);
        director.createElectric(carManualBuilder);
        System.out.println(carManualBuilder.getResult().engine);

        CarBuilder carBuilder2 = new CarBuilder();
        FixedDirector carDirector = new FixedDirector(carBuilder2);
        CarManualBuilder carManualBuilder2 = new CarManualBuilder();
        FixedDirector carManualDirector = new FixedDirector(carManualBuilder2);
        carDirector.createDiesel();
        System.out.println(carBuilder.getResult().engine);
        carManualDirector.createElectric();
        System.out.println(carManualBuilder.getResult().engine);

    }
}
