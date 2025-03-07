package example.devices;

public class SurroundSoundSystem implements Device{

    @Override
    public void turnOn() {

        switchToFavoriteCD();
        increaseVolume();
        System.out.println("Sound system has been turned on");

    }

    @Override
    public void turnOff() {

        lowerVolume();
        System.out.println("Surround sound system has been turned off");

    }

    private void increaseVolume(){
        System.out.println("Volume has increased to a comfortable level on startup");
    }

    private void switchToFavoriteCD(){
        System.out.println("Michael Bolton now playing");
    }

    private void lowerVolume(){
        System.out.println("Lowering surround sound volume before closeing system");
    }

    @Override
    public String toString(){
        return "Sound System";
    }

}
