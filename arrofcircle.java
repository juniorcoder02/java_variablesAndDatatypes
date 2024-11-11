import java.util.*;

public class arrofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle :");
        float radius = sc.nextFloat();
        float pie = 3.14f;
        float arrofcircle = pie * radius * radius;
        System.err.println("Area of circle is : " + arrofcircle);

    }
}