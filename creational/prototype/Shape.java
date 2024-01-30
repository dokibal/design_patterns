package creational.prototype;

import java.util.Objects;

public abstract class Shape{

    public int x = 0;
    public int y = 0;
    public String color;

    public Shape(){}
    public Shape(Shape target){
        if(target!=null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    public abstract Shape clone();
    public boolean equals(Object object2){
        if(!(object2 instanceof Shape)){
            return false;
        }
        Shape target = (Shape)object2;
        return this.x==target.x && this.y ==target.y && Objects.equals(this.color,target.color);
    }
};