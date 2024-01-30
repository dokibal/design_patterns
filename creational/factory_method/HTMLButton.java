package factory_method;
public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Click me</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Onclick HTML button");
    }
    
}
