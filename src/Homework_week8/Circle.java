package Homework_week8;

public class Circle {

    private static final double PI = 3.14;
    private double radius;
    public Circle(double r){
        if (r<0){
            r = 0;
        }
        radius = r;
    }
    public double getRadius(){
        return  radius;
    }
    public double getArea(){
        return radius * radius * PI;
    }
}