package Field_Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A simple calculator that finds the area of a field
        Scanner scn = new Scanner(System.in);
        System.out.print("Length of the field (in m): ");
        float l = scn.nextFloat();
        System.out.print("Width of the field (in m): ");
        float w = scn.nextFloat();
        float area = l * w;
        float boundary = 2 * (l * w);
        System.out.println("The area of the field: " + area + "m");
        System.out.println("The boundary of the field: " + boundary + "m");
    }
}
