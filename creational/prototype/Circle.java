package creational.prototype;

public class Circle extends Shape{
    public int radius = 0;

    public Circle(){}
    public Circle(Circle target){
        super(target);
        this.radius = target.radius;
    }
    public Shape clone(){
        return new Circle(this);
    }
    public boolean equals(Object object2){
        if (!(object2 instanceof Circle)){return false;}
        Circle target = (Circle)object2;
        return super.equals(object2) && this.radius==target.radius;
    }
}
