package oop_les1.Point2D;

public class Point2D {
    private int x,y;

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value,value);
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }

    // public Point2D(int value) {
    //     x = value;
    //     y = value;
        
    // }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public String getInfo(){
        return String.format("X : %d; Y : %d ", x,y);
    }
    //Переопределение метода getInfo через обращение toString к getInfo
    @Override
    public String toString() {
        return getInfo();
    }

}
