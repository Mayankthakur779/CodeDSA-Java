import java.util.*;

class Circle {
    public static float Circum(int r) {
        float c = 2 * 3.14f * r;
        return c; 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = sc.nextInt();
        float result = Circum(r); 
        System.out.println("The circumference of the circle is: " + result);
    }
}
