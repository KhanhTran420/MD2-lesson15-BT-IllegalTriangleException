import java.util.Scanner;

public class ILLegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a của tam giác");
        double a = scanner.nextDouble();
        System.out.println("Nhập cạnh b của tam giác");
        double b = scanner.nextDouble();
        System.out.println("Nhập cạnh c của tam giác");
        double c = scanner.nextDouble();

        try {
            Triangle triangle = new Triangle(a,b,c);
        }catch (ILLegalTriangleException e){
            e.printStackTrace();
        }
    }
}
