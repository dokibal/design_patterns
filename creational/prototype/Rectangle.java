package creational.prototype;

public class Rectangle extends Shape{
    public int width = 0;
    public int height = 0;
    public Rectangle(){}
    public Rectangle(Rectangle target){
        super(target);
        this.width = target.width;
        this.height = target.height;
    }
    public Shape clone(){
        return new Rectangle(this);
    }
    public boolean equals(Object object2){
        if (!(object2 instanceof Rectangle)){return false;}
        Rectangle target = (Rectangle)object2;
        return super.equals(object2) && this.width==target.width && this.height==target.height;
    }
}
