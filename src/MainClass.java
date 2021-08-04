import java.util.Scanner;

public class MainClass {
    static int count=1;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Rectangle's 1st and 2nd value");
        Rectangle rectangle=new Rectangle(scanner.nextInt(),scanner.nextInt());
        System.out.println("---------------------------------------------");
        System.out.println("Rectangle ");
        rectangle.area();
        rectangle.perimeter();
        System.out.println("----------------------------------------------");
        for(count=1;count<=10;count++) {
        System.out.println(count+". "+"Enter the Square value");
        Square square=new Square(scanner.nextInt());
        System.out.println("---------------------------------------------");
        System.out.println("Square ");

            square.area();
            square.perimeter();
            System.out.println("----------------------------------------------");
        }
        System.out.println("--------------------finished-------------------");
    }
}
