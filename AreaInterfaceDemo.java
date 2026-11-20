interface Area{
double computeArea();
}

class Circle implements Area{
private double radius;

Circle(double radius){
this.radius=radius;
}

public double computeArea(){
return Math.PI*radius*radius;
}
}

class Rectangle implements Area{
private double length,breadth;

Rectangle(double length,double breadth){
this.length=length;
this.breadth=breadth;
}

public double computeArea(){
return length*breadth;
}
}

public class AreaInterfaceDemo{

public static void main(String[] args){

Area circle=new Circle(5);
System.out.println("Area of Circle:"+circle.computeArea());

Area rectangle = new Rectangle(10,15);
System.out.println("Area of Rectangle:"+rectangle.computeArea());
}
}

