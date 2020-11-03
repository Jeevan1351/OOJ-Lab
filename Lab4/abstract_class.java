import java.util.*;

abstract class Shape{
int h, v;
abstract void printArea();
}

class Rectangle extends Shape{
void printArea(){System.out.println("Area of rectangle is: "+(h*v));}
}
class Circle extends Shape{
void printArea(){System.out.println("Area of Circle is: "+(3.14*h*v));}
}
class Triangle extends Shape{
void printArea(){System.out.println("Area of triangle is: "+(0.5*h*v));
}}
class abstract_class{
public static void main(String args[]){
Shape s1=new Circle();
Shape s2=new Rectangle();
Shape s3= new Triangle();
s1.h=5;
s1.v=5;
s2.h=6;
s2.v=10;
s3.h=8;
s3.v=12;
s1.printArea();
s2.printArea();
s3.printArea();
}
}
