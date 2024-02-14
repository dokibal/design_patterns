package prototype;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache(){
        Circle circle = new Circle();
        circle.x = 100;
        circle.y = 100;
        circle.color = "Green";
        circle.radius = 100;

        cache.put("Big green circle", circle);

        Rectangle rect = new Rectangle();
        rect.x = 5;
        rect.y = 10;
        rect.color = "Blue";
        rect.width = 10;
        rect.height = 10;

        cache.put("Small blue rectangle", rect);
    }

    public Shape put(String key, Shape shape){
        return cache.put(key, shape);
    }

    public Shape get(String key){
        return cache.get(key);
    }
}
