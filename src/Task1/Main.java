package Task1;

public class Main {
    public static void main(String[] args) {
        /*
        Skriv en klasse, der simulerer et Task1.TV. Der skal være mulighed for at vælge kanel, volumen og tænde
        og slukke for Task1.TV. Husk at det ikke giver mening at forsøge at ændre lyd/kanal, hvis Task1.TV er slukket J
        Prøv at unit teste følgende adfærd:

        Task1.TV tv1 = new Task1.TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        Task1.TV tv2 = new Task1.TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();
         */

        TV tv1 = new TV();

        tv1.turnOn();
        tv1.setChannel(20);
        //tv1.turnOff();
        tv1.setVolume(10);
        tv1.channelUp();
        tv1.channelDown();




    }
}