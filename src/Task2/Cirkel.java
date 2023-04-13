package Task2;

import java.io.IOException;

public class Cirkel {

    private int radius;


    public void setRadius(int r) {


            if (r > 0) {
                this.radius = r;
                System.out.println("radius is set to: " + r);
            }else{
            System.out.println("only positive numbers are allowed to design a circle");
        }
    }

    public void getArea() {
        System.out.println("The area of the circle is: " + (radius * radius * Math.PI));
    }

}
