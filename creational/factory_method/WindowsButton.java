package factory_method;
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Onclick Windows button");
    }
    
}
