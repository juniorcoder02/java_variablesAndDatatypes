import java.util.*;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Question 1 : In a program, input 3 numbers: A, B andC. You have to output the
         * average of
         * these 3 numbers.
         * (Hint : Average of N numbers is sum of those numbers divided by N)
         */

        // System.out.println("Enter three numbers :");
        // float num1 = sc.nextFloat();
        // float num2 = sc.nextFloat();
        // float num3 = sc.nextFloat();
        // float average= (num1+num2+num3)/3;
        // System.out.println("Average of 3 number is = " + average);

        /*
         * Question 2: In a program, input the side of a square. You have to output the
         * area of the
         * square.
         * (Hint : area of a square is (side x side))
         */

        // System.out.print("Enter Side of the square :");
        // float side = sc.nextFloat();
        // // float arrofsquare= side*side;
        // System.err.println("Area of the square is : " + (side * side));

        /*
         * Question 3: Enter cost of 3 items from the user (using float data type)- a
         * pencil, a pen and
         * an eraser. You have to output the total cost of the items back to the user as
         * their bill.
         * (Add on : You can also try adding 18% gst tax to the items in the bill as an
         * advanced problem)
         */

        System.out.print("Enter the cost of pencil :");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of pen :");
        float pen = sc.nextFloat();

        System.out.print("Enter the cost of Eraser :");
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;
        float gstBill= bill + (0.18f*bill);

        System.out.println("Your total amount is : " + bill);
        System.out.println("Your total amount including GST is : " + gstBill);

    }
}