public class Triangle{
    public double ladoA, ladoB, ladoC;
    public Triangle(double a, double b, double c){
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }
    public double perimeter(){
        return ladoA+ladoB+ladoC;
    }
    public double area(){
        return 0;
    }
}