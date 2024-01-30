package abstract_factory;

public class ModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on modern chair.");
    }
    
}
