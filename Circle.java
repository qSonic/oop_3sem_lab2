package oop_lab2;

public class Circle {
    private double x, y, r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "oop_lab2.Circle{" +
                "x=" + x +
                ", y=" + y + ", r=" + r + ", colour='" + colour + '\'' + "}";
    }

    public double getLenght() {
        double c;
        c = 2*Math.PI * r;
        return c;
    }
}