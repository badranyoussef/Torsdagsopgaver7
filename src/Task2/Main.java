package Task2;

public class Main {

    public static void main(String[] args) {

        /*
        Skriv en klasse, der repræsenterer en cirkel med en radius som attribut og en set metode.
        Hvis metoden modtager en negativ radius som parameter, skal der kastes en Exception.
        Der skal være en metode til at udregne cirklens areal.
         */

    Cirkel circle = new Cirkel();

    try {
        circle.setRadius(-4);
    }catch (Exception e){
        System.out.println("test");
    }

    circle.getArea();

    }

}
