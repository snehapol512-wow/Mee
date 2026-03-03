package Assignment2;

abstract class Shape { abstract double area(); }
class Circle extends Shape {
    double r; Circle(double r){ this.r=r; }
    double area(){ return Math.PI*r*r; }
}
class Rectangle extends Shape {
    double l,b; Rectangle(double l,double b){ this.l=l; this.b=b; }
    double area(){ return l*b; }

    public static void main(String[] args) {
        Shape s1 = new Circle(5), s2 = new Rectangle(4, 6);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
