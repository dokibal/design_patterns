package abstract_factory;

public class VictorianChair implements Chair {

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on Victorian chair.");
    }
    
}
