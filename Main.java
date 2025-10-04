import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //change rectangle parameters here
        float px = 1.0f;
        float py = 2.0f;
        float w = 3.0f;
        float h = 5.0f;
        //////////////////////////////////////

        Rectangle rect = new Rectangle(px,py,w,h);
        System.out.printf("The rectangle is set to (%.1f,%.1f) with width %.1f and height %.1f\n",px,py,w,h);
        System.out.println("give x and y coordinates: ");
        System.out.print("x: ");
        
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        
        System.out.print("y: ");
        float y = sc.nextFloat();

        sc.close();
        
        if(rect.contains(x, y)){
            System.out.printf("The point (%.1f,%.1f) is inside the rectangle\n",x,y);
        } else {
            System.out.printf("The point (%.1f,%.1f) is outside the rectangle\n",x,y);
        }
    }
}
