package Task1;

public class TV {

    private boolean isTvOn = false;
    private int volume;
    private int channel;


    public void setChannel(int chooseChannel){
        if(isTvOn) {
            channel = chooseChannel;
            System.out.println("Channel "+chooseChannel+" is set");
        }else{
            System.out.println("You can not select af channel when the tv is off");
        }
    }

    public void setVolume(int setVolume){
        if(isTvOn) {
            volume = setVolume;
            System.out.println("Volume set to: "+setVolume);
        }else{
            System.out.println("You can not turn up or lower the volume when the tv is off");
        }
    }

    public void turnOff(){
        isTvOn = false;
        System.out.println("The Task1.TV is turned OFF");
    }

    public void turnOn(){
        isTvOn = true;
        System.out.println("The Task1.TV is turned ON");
    }

    public void channelUp() {
        if(isTvOn) {
            channel++;
            System.out.println("Channel "+channel+" is set");
        }else{
            System.out.println("You can not select af channel when the tv is off");
        }
    }

    public void channelDown() {
        if(isTvOn) {
            channel--;
            System.out.println("Channel "+channel+" is set");
        }else{
            System.out.println("You can not select af channel when the tv is off");
        }
    }


    public void volumeUp(){
        if(isTvOn) {
            volume++;
            System.out.println("Volume set to: "+volume);
        }else{
            System.out.println("You can not turn up or lower the volume when the tv is off");
        }
    }

    public void volumeDown(){
        if(isTvOn) {
            volume--;
            System.out.println("Volume set to: "+volume);
        }else{
            System.out.println("You can not turn up or lower the volume when the tv is off");
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }
}
