package oop_lab2;
import java.util.Scanner;
import java.lang.*;
public class Tester {
    public static void main(String[] args){
        double r;
        Circle k1 = new Circle(3.1,4.1,5.1,"red" );
        System.out.println("Длина окружности = " + k1.getLenght() + "см\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус");
        r = sc.nextDouble();
        k1.setR(r);
        System.out.println("Длина окружности = " + k1.getLenght() + "см\n");
        System.out.println(k1.toString());
    }
}
