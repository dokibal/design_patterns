package abstract_factory;

public class ArtDecoFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
    
}
