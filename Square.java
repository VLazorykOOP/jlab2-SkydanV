import java.util.Scanner; 
public class Square {
    private double side; 

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

    public double getDiagonal() {
        return side * Math.sqrt(2);
    }

    @Override
    public String toString() {
        return "Square with side: " + side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Введiть довжину сторони квадрата: "); 
        double sideLength = scanner.nextDouble(); 

        Square square = new Square(sideLength); 
        System.out.println(square);
        System.out.println("Периметр: " + square.getPerimeter());
        System.out.println("Площа: " + square.getArea());
        System.out.println("Довжина дiагоналi: " + square.getDiagonal());
    
        scanner.close();
    }
}
