package abstract_factory;

enum Style{
    MODERN,
    VICTORIAN,
    ART_DECO
}

public class Client {
    static FurnitureFactory factory;

    public static FurnitureFactory configure(Style style){
        switch(style){
            case MODERN:
                return new ModernFactory();
            case VICTORIAN:
                return new VictorianFactory();
            case ART_DECO:
                return new ArtDecoFactory();
            default:
                throw new RuntimeException("Unexpected style used.");
        }
    }
    public static void main(String[] args){
        factory = configure(Style.ART_DECO);
        Chair chair = factory.createChair();
        Sofa sofa= factory.createSofa();
        System.out.println("The chair has legs: "+chair.hasLegs());
        chair.sitOn();
        sofa.lieOn();
    }
}
