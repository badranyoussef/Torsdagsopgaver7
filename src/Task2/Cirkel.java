package Task2;

import java.io.IOException;

import static com.sun.tools.javac.jvm.ByteCodes.illegal;

public class Cirkel {

    private double radius;


    public void setRadius(double r) throws IllegalArgumentException {
            if (r < 0) {
                throw new IllegalArgumentException("only positive numbers are allowed to design a circle");
            }
                this.radius = r;
                System.out.println("radius is set to: " + r);
    }

    public void getArea() {
        if(radius >0) {
            System.out.println("The area of the circle is: " + (radius * radius * Math.PI));
        }else{
            System.out.println("Area will not be calculated with a negative or");
        }
    }

}
