import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Radius: ");
	double r = input.nextDouble();
	System.out.print("Angle: ");
	double angle = input.nextDouble();
	double pi = 3.14;
	double area = pi*r*r*angle/360;
	System.out.println(area);
    }
}
